package com.TextMVC.controller;

import com.TextMVC.domain.EventDto;

import com.TextMVC.domain.ResponseDto;
import com.TextMVC.service.NLUService;
import com.TextMVC.service.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ConversationController {

    @Autowired
    private SessionHandler sessionHandler;

    @Autowired
    private NLUService nluService;

    @RequestMapping(value = "/sendText", method = RequestMethod.POST)
    public ResponseEntity<?> nlProcess(@RequestBody @Valid EventDto eventDto) throws Exception{
        String sessionId = eventDto.getSessionId();
        String clientText = eventDto.getText();

        /*
        The session id would remain unchanged if the id from client response is not null.
        Otherwise the server side would assign a new id for the client usage.
         */
        String newId = sessionHandler.handle(sessionId);
        String retText = nluService.handleText(clientText);
        ResponseDto retDto = new ResponseDto(newId, retText);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .body(retDto);
    }

}
