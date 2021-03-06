package com.puzzle.server.controllers;

import com.puzzle.server.dto.ArtistInfo;
import com.puzzle.server.dto.ConcertInfo;
import com.puzzle.server.dto.ConcertUpdateInfo;
import com.puzzle.server.dto.Time;
import com.puzzle.server.services.ConcertService;
import com.puzzle.server.services.TimeFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("{concertName}")
@CrossOrigin
public class InfoController {

    @Autowired
    private ConcertService concertService;

    @Autowired
    private TimeFormatService timeFormatService;

    @GetMapping("/concert-start")
    public ResponseEntity<Time> getConcertStartTime(@PathVariable String concertName) {
        return new ResponseEntity<>(new Time(timeFormatService.format("24.03.2019 12:00:00")), OK);
    }

    @GetMapping("/artist-info")
    public ResponseEntity<ArtistInfo> getArtistInfo(@PathVariable String concertName) {
        return new ResponseEntity<>(concertService.getConcertInfo(concertName).getArtistInfo(), OK);
    }

    @GetMapping("/concert-update")
    public ResponseEntity<ConcertUpdateInfo> getConcertUpdate(@PathVariable String concertName) {
        return new ResponseEntity<>(concertService.getConcertInfo(concertName).getConcertUpdateInfo(), OK);
    }

    @GetMapping("/concert-info")
    public ResponseEntity<ConcertInfo> getConcertInfo(@PathVariable String concertName) {
        return new ResponseEntity<>(concertService.getConcertInfo(concertName), OK);
    }

}
