package com.dva.gptIntegration.Service;

import com.dva.gptIntegration.models.gemiRequest.RequesGemi;

public interface IGemiService {

    Object callGemi(RequesGemi gemiRequest) throws Exception;

}
