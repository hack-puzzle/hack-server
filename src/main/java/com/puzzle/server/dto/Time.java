package com.puzzle.server.dto;

import com.fasterxml.jackson.annotation.JsonView;

@JsonView
public class Time {

    @JsonView
    private String time;

    public Time(String time) {
        this.time = time;
    }
}
