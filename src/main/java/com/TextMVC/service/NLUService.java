package com.TextMVC.service;

import com.TextMVC.domain.EventDto;
import com.TextMVC.domain.ResponseDto;
import com.TextMVC.service.error.NLUException;
import com.TextMVC.service.thrift.ThriftClient;
import com.external.vnluservice.NLUOperator;
import com.external.vnluservice.UContent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;

@Service
public class NLUService {
    private final Logger logger = LogManager.getLogger(NLUService.class);

    @Value("${nlu.engine}")
    private String nluEngine;

    @Value("${nlu.port}")
    private int nluPort;

    @Value("${nlu.map.wrap}")
    private boolean mapWrap;

    public NLUService() {}

    public String handleText(String sentence){
        String ret = "";
        try{
            ThriftClient thriftClient = new ThriftClient(nluPort);
            NLUOperator.Client client = thriftClient.nlp_client();
            List<UContent> uContents = client.vUnderstand(sentence, nluEngine);
            for (UContent uContent: uContents){
                String cur = "Action:" + uContent.getAction() + ". Skill:" +
                        uContent.getSkill() + ". Slots:" + uContent.getPayload();
                ret = ret + cur + "\n";
            }
        } catch (TException e){
            throw new NLUException(e.getMessage());
        }
        return ret;
    }

    private Mono<ResponseDto> blockingWrapper(EventDto eventDto){
        return Mono.just(eventDto)
                .flatMap(eventDto1 -> {
                    String ret = "";
                    try{
                        ThriftClient thriftClient = new ThriftClient(nluPort);
                        NLUOperator.Client client = thriftClient.nlp_client();
                        List<UContent> uContents = client.vUnderstand(eventDto1.getText(), nluEngine);
                        for (UContent uContent: uContents){
                            String cur = "Action:" + uContent.getAction() + ". Skill:" +
                                    uContent.getSkill() + ". Slots:" + uContent.getPayload();
                            ret = ret + cur + "\n";
                        }
                    } catch (TException e){
                        throw new NLUException(e.getMessage());
                    }
                    logger.info(ret);
                    return Mono.just(new ResponseDto(eventDto1.getSessionId(),ret));
                })
                .subscribeOn(Schedulers.elastic());
    }

    public Mono<ResponseDto> handle(EventDto eventDto){
        return Mono.just(eventDto)
                .flatMap(eventDto1 -> blockingWrapper(eventDto1))
                .switchIfEmpty(Mono.error(new IllegalStateException("Bad response from NLU process")));
    }
}
