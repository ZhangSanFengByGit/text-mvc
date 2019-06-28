package com.TextMVC.service;

import com.TextMVC.domain.EventDto;
import com.TextMVC.domain.SessionId;
import com.TextMVC.domain.SessionIdRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SessionHandler {
    private final Logger logger = LogManager.getLogger(SessionHandler.class);

    @Autowired
    private SessionIdRepository sessionIdRepository;

    public SessionHandler() {}

    public Mono<SessionId> handleError(Throwable throwable){
        return Mono.just(new SessionId())
                .flatMap(sessionIdRepository::save);
    }

    public Mono<SessionId> handle(EventDto eventDto){
        return Mono.just(eventDto)
                .map(EventDto::getSessionId)
                .flatMap(s -> Mono.just(s)
                            .flatMap(sessionId ->sessionIdRepository.findById(sessionId))
                            .switchIfEmpty(Mono.just(new SessionId())
                            .flatMap(sessionIdRepository::save))
                )
                .onErrorResume(throwable -> Mono.from(handleError(throwable)));
    }
}
