package com.dva.gptIntegrationA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dva.gptIntegrationA.Service.GemiService;
import com.dva.gptIntegrationA.Service.IGemiService;
import com.dva.gptIntegrationA.models.gemiRequest.RequesGemi;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ChatController {

    @Autowired
    private GemiService gemiService;

    @PostMapping("/chat")
    public ResponseEntity<Object> chat(@RequestBody RequesGemi gemiRequest) throws Exception {
        return ResponseEntity.ok(gemiService.callGemi(gemiRequest));
    }

}
