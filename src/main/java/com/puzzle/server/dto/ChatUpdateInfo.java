package com.puzzle.server.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@JsonSerialize
public class ChatUpdateInfo {

    @Getter
    @Setter
    private List<Message> msgList = new LinkedList<>();

}
