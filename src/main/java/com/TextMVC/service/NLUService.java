package com.TextMVC.service;

import com.TextMVC.service.error.NLUException;
import com.TextMVC.service.thrift.ThriftClient;
import com.external.vnluservice.NLUOperator;
import com.external.vnluservice.UContent;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NLUService {

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
}
