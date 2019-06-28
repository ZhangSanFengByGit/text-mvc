package com.TextMVC.config;

import com.TextMVC.domain.SessionId;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RedisCleaner {
    private final ReactiveRedisConnectionFactory factory;
    private final ReactiveRedisOperations<String, SessionId> sessionOps;

    public RedisCleaner(ReactiveRedisConnectionFactory factory,
                        ReactiveRedisOperations<String, SessionId> sessionOps){
        this.factory = factory;
        this.sessionOps = sessionOps;
    }

    @PostConstruct
    public void clean(){
        factory.getReactiveConnection().serverCommands().flushAll();
    }
}
