package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
public class ConcertInfo {

    private ArtistInfo artistInfo;

    private ConcertUpdateInfo concertUpdateInfo;

}
