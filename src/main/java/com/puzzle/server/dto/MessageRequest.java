package com.puzzle.server.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;

@JsonSerialize
@Getter
public class MessageRequest {

    @JsonView
    protected String userId;

    @JsonView
    protected String text;
}
