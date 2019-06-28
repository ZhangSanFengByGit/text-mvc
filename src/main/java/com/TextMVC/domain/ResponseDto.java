package com.TextMVC.domain;

public class ResponseDto {
    private String sessionId;
    private String text;

    public ResponseDto(){}

    public ResponseDto(String sessionId, String text){
        this.sessionId = sessionId;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
