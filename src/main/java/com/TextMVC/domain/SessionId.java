package com.TextMVC.domain;

import javax.persistence.*;

@Entity
@Table(name = "sessionId")
public class SessionId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public SessionId(){}

    public Long getId() {
        return id;
    }
}
