package com.TextMVC.controller;

import com.TextMVC.domain.EventDto;
import com.TextMVC.domain.ResponseDto;
import com.TextMVC.service.NLUService;
import com.TextMVC.service.SessionHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ConversationController {
    private final Logger logger = LogManager.getLogger(ConversationController.class);

    @Autowired
    private SessionHandler sessionHandler;

    @Autowired
    private NLUService nluService;

    @RequestMapping("/sendText")
    public Mono<ResponseDto> processText(@RequestBody EventDto eventDto){
        return Mono.just(eventDto)
                .map(eventDto1 -> {
                    sessionHandler.handle(eventDto1)
                            .map(sessionId -> sessionId.getId())
                            .subscribe(id -> {eventDto1.setSessionId(String.valueOf(id));});
                    return  eventDto1;
                })
                .flatMap(eventDto1 -> Mono.from(nluService.handle(eventDto1)))
                .switchIfEmpty(Mono.error(new IllegalStateException("No valid response returned from NLU service")));
    }
}
