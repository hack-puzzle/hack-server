package com.puzzle.server.services;

import com.puzzle.server.dto.ArtistInfo;
import com.puzzle.server.dto.ConcertInfo;
import com.puzzle.server.dto.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConcertService {

    @Autowired
    private TimeFormatService timeFormatService;

    private static Map<String, ConcertInfo> concertInfoMap = new HashMap<>();

    @PostConstruct
    protected void init() {
        // Radio Tapok
        ConcertInfo concertInfo = new ConcertInfo();
        ArtistInfo artistInfo = new ArtistInfo();
        artistInfo.setName("Radio Tapok");
        concertInfo.setArtistInfo(artistInfo);
        concertInfo.setStartTime(new Time(timeFormatService.format("12.11.2012 11:12:00")));
        concertInfoMap.put("radiotapok", concertInfo);
    }

    public ConcertInfo getConcertInfo(String concertName) {
        return concertInfoMap.get(concertName);
    }
}
