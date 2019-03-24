package com.puzzle.server.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;

@JsonSerialize
@AllArgsConstructor
public class RegistrationResponse {

    @JsonView
    private Integer userId;

}
