package com.dva.gptIntegration.models.gemiResponse;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Candidates implements Serializable {

    private Content content;

}
