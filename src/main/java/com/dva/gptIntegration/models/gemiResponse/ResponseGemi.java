package com.dva.gptIntegration.models.gemiResponse;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseGemi implements Serializable {

    List<Candidates> candidates;

}
