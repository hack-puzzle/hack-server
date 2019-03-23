package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonSerialize
public class ConcertUpdateInfo {

    private String startTime;
    private List<Notification> notificationList = new ArrayList<>();
    private int currentSongId = -1;

    public void nextSong() {
        currentSongId++;
    }
}
