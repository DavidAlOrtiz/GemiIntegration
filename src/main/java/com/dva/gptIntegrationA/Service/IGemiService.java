package com.dva.gptIntegrationA.Service;

import com.dva.gptIntegrationA.models.gemiRequest.RequesGemi;

public interface IGemiService {

    Object callGemi(RequesGemi gemiRequest) throws Exception;

}
