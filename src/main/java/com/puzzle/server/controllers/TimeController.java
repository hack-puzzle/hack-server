package com.puzzle.server.controllers;

import com.puzzle.server.dto.Time;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class TimeController {

    @GetMapping("concert-start")
    @CrossOrigin
    public ResponseEntity<Time> getConcertStartTime() {
        return new ResponseEntity<>(new Time("12:00:00"), OK);
    }
}
