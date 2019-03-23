package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonSerialize
public class ConcertInfo {

    private ArtistInfo artistInfo;

    private ConcertUpdateInfo concertUpdateInfo;

    private List<Song> songList = new ArrayList<>();

}
