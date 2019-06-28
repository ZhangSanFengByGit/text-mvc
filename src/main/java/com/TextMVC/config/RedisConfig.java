package com.TextMVC.config;

import com.TextMVC.domain.SessionId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfig {

    @Primary
    @Bean
    public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory(){
        return new LettuceConnectionFactory("localhost", 7777);
    }

    @Bean
    ReactiveRedisTemplate<String, SessionId> redisOperations(ReactiveRedisConnectionFactory factory){
        Jackson2JsonRedisSerializer<SessionId> serializer = new Jackson2JsonRedisSerializer(SessionId.class);

        RedisSerializationContext.RedisSerializationContextBuilder<String, SessionId> builder =
                RedisSerializationContext.newSerializationContext(new StringRedisSerializer());

        RedisSerializationContext<String, SessionId> context = builder.value(serializer).build();

        return new ReactiveRedisTemplate<>(factory, context);
    }

    @Bean
    ReactiveValueOperations reactiveValueOperations(ReactiveRedisTemplate<String, SessionId> template){
        return template.opsForValue();
    }
}
