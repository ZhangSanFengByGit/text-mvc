package com.TextMVC.service;

import com.TextMVC.domain.SessionId;
import com.TextMVC.domain.SessionIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SessionHandler {
    @Autowired
    private SessionIdRepository sessionIdRepository;

    public SessionHandler() {}

    public String handle(String sessionId){
        try {
            Long isLong = Long.valueOf(sessionId);
        }
        catch (java.lang.NumberFormatException e){
            SessionId newId = new SessionId();
            sessionIdRepository.save(newId);
            String newIdString = Long.toString(newId.getId());
            return newIdString;
        }
        Optional<SessionId> idEntity = sessionIdRepository.findById(Long.valueOf(sessionId));
        if (!idEntity.isPresent()){
            SessionId newId = new SessionId();
            sessionIdRepository.save(newId);
            String newIdString = Long.toString(newId.getId());
            return newIdString;
        }
        return sessionId;
    }
}
