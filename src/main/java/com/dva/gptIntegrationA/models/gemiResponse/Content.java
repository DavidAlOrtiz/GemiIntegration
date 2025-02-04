package com.dva.gptIntegrationA.models.gemiResponse;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Content implements Serializable {

    List<Parts> parts;

}
