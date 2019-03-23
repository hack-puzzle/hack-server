package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonSerialize
public class ConcertUpdateInfo {

    private Time startTime;
    private List<Notification> notificationList;
    private int currentSongId;

}
