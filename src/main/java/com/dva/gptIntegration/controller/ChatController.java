package com.dva.gptIntegration.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dva.gptIntegration.Service.GemiService;
import com.dva.gptIntegration.models.gemiRequest.RequesGemi;
import com.dva.gptIntegration.models.gemiResponse.Candidates;
import com.dva.gptIntegration.models.gemiResponse.ResponseGemi;

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
