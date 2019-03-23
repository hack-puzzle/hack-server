package com.puzzle.server.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcertInfo {

    private ArtistInfo artistInfo;

    private Time startTime;

}
