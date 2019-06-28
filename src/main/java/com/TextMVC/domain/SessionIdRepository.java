package com.TextMVC.domain;

import reactor.core.publisher.Mono;

public interface SessionIdRepository {

    Mono<SessionId> findById(String id);

    Mono<SessionId> save(SessionId sessionId);
}
