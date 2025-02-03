package com.dva.gptIntegration.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dva.gptIntegration.Utils.GemiUtils;
import com.dva.gptIntegration.models.gemiRequest.RequesGemi;
import com.dva.gptIntegration.models.gemiResponse.ResponseGemi;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GemiService implements IGemiService {

    @Value("${openai.api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Object callGemi(RequesGemi gemiRequest) throws Exception {

        ResponseGemi response = restTemplate.postForObject(apiUrl, GemiUtils.buildRequest(gemiRequest),
                ResponseGemi.class);

        return response.getCandidates().getFirst().getContent().getParts().getFirst();
    }

}
