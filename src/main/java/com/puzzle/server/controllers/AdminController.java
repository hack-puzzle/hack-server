package com.puzzle.server.controllers;

import com.puzzle.server.services.ConcertService;
import com.puzzle.server.services.TimeFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
