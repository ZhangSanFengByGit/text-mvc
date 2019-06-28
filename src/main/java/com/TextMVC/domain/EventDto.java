package com.TextMVC.domain;

public class EventDto {
    private String sessionId;
    private String text;

    public EventDto(){}

    public EventDto(String sessionId, String text){
        this.sessionId = sessionId;
        this.text = text;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getText() {
        return text;
    }

    public void setSession(String session) {
        this.sessionId = session;
    }

    public void setText(String text) {
        this.text = text;
    }
}
