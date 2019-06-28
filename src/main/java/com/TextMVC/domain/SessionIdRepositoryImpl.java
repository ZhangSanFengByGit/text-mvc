package com.TextMVC.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveValueOperations;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class SessionIdRepositoryImpl implements SessionIdRepository {

    private static Long assignId = 0L;

    @Autowired
    private ReactiveRedisTemplate<String, SessionId> reactiveRedisTemplate;

    @Autowired
    private ReactiveValueOperations<String, SessionId> reactiveValueOps;

    public Mono<SessionId> findById(String id){
        return Mono.from(reactiveValueOps.get(id));
    }

    public Mono<SessionId> save(SessionId sessionId){
        return Mono.just(sessionId)
                    .map(s -> {
                        s.setId(String.valueOf(assignId++));
                        return s;
                    })
                    .flatMap(s1 -> reactiveValueOps.set(s1.getId(), s1))
                    .flatMap(b -> {
                        if (b){
                            return Mono.just(sessionId);
                        }else {
                            return Mono.error(new IllegalStateException("Redis fail saving"));
                        }
                    });

    }
}
