package com.TextMVC;

import com.TextMVC.domain.SessionId;

import com.TextMVC.domain.SessionIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    @Autowired
    private SessionIdRepository sessionIdRepository;

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
