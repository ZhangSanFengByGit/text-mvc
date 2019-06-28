package com.TextMVC.service.error;

public class NLUException extends RuntimeException {
    public NLUException(String message) {
        super("[NLU ERR]" + message);
    }
}
