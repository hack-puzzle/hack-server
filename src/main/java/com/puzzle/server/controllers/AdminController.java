package com.puzzle.server.controllers;

import com.puzzle.server.dto.Notification;
import com.puzzle.server.services.ConcertService;
import com.puzzle.server.services.TimeFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Controller
@RequestMapping("{concertName}")
@CrossOrigin
public class AdminController {

    @Autowired
    private ConcertService concertService;

    @Autowired
    private TimeFormatService timeFormatService;

    @RequestMapping("/")
    public String admin(@PathVariable String concertName) {
        return "index.html";
    }

    @PostMapping("/change-start-time")
    public ResponseEntity<HttpStatus> changeStartTime(@PathVariable String concertName,
                                                     @RequestParam String startTime) {
        concertService.getConcertInfo(concertName)
                .getConcertUpdateInfo().setStartTime(timeFormatService.format(startTime));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("notification-send")
    public ResponseEntity<HttpStatus> sendNotification(@PathVariable String concertName,
                                                      @RequestParam String text) {
        concertService.getConcertInfo(concertName)
                .getConcertUpdateInfo()
                .getNotificationList()
                .add(new Notification(text, timeFormatService.format(LocalDateTime.now())));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("notification-clear")
    public ResponseEntity<HttpStatus> clearNotifications(@PathVariable String concertName) {
        concertService.getConcertInfo(concertName)
                .getConcertUpdateInfo()
                .setNotificationList(new ArrayList<>());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("next-song")
    public ResponseEntity<HttpStatus> nextSong(@PathVariable String concertName) {
        concertService.getConcertInfo(concertName)
                .getConcertUpdateInfo()
                .nextSong();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
