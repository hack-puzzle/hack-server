package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@AllArgsConstructor
public class Notification {

    private String text;
    private String time;
}
