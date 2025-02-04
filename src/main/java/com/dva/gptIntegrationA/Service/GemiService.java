package com.dva.gptIntegrationA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dva.gptIntegrationA.Utils.GemiUtils;
import com.dva.gptIntegrationA.models.gemiRequest.RequesGemi;
import com.dva.gptIntegrationA.models.gemiResponse.ResponseGemi;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GemiService implements IGemiService {

    @Value("${gemini.api.url}")
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
