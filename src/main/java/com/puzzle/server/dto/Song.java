package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;

@JsonSerialize
@AllArgsConstructor
public class Song {

    private String name;

}
