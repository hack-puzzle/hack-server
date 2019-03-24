package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@AllArgsConstructor
@Getter
@Setter
public class Song {

    private String name;

    public Song(String name) {
        this.name = name;
    }

    private String photoUrl;
    private String text;


}
