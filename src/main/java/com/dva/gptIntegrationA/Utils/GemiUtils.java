package com.dva.gptIntegrationA.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.dva.gptIntegrationA.models.gemiRequest.RequesGemi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GemiUtils {

    public static HttpEntity<Map<String, Object>> buildRequest(RequesGemi gemiRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(GemiUtils.builBody(gemiRequest), headers);
        log.info("Request {}", request);
        return request;
    }

    private static Map<String, Object> builBody(RequesGemi gemiRequest) {
        Map<String, Object> contents = new HashMap<>();
        Map<String, Object> parts = new HashMap<>();
        Map<String, Object> requestBody = new HashMap<>();
        parts.put("text", gemiRequest.getText());
        contents.put("parts", Arrays.asList(parts));
        requestBody.put("contents", Arrays.asList(contents));
        return requestBody;
    }

}
