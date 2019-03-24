package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@AllArgsConstructor
@Getter
@Setter
public class Message {

    private Integer userId;
    private String text;
    private String userName;

}
