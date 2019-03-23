package com.puzzle.server.services;

import com.puzzle.server.dto.ArtistInfo;
import com.puzzle.server.dto.ConcertInfo;
import com.puzzle.server.dto.ConcertUpdateInfo;
import com.puzzle.server.dto.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
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
        artistInfo.setSiteUrl("http://radiotapok.ru");
        artistInfo.setPhotoUrl("assets/artists/radiotapok/tapok-icon.png");
        concertInfo.setArtistInfo(artistInfo);
        ConcertUpdateInfo concertUpdateInfo = new ConcertUpdateInfo();
        concertUpdateInfo.setStartTime(timeFormatService.format("24.03.2019 19:00"));
        concertInfo.setConcertUpdateInfo(concertUpdateInfo);
        concertInfo.getSongList().addAll(Arrays.asList(
           new Song("A Reason To Fight"),
           new Song("Ich will"),
           new Song("Sweet Dreams"),
           new Song("My Blood"),
           new Song("Demons Are A Girl’s Best Friend"),
           new Song("Wrong Side of Heaven"),
           new Song("Jumpsuit"),
           new Song("In The End"),
           new Song("Decadence"),
           new Song("Stan")
        ));


        concertInfoMap.put("radiotapok", concertInfo);

        // Team
        concertInfo = new ConcertInfo();
        artistInfo = new ArtistInfo();
        artistInfo.setName("Team");
        artistInfo.setSiteUrl("http://ifmo.ru");
        artistInfo.setPhotoUrl("assets/artists/radiotapok/tapok-icon.png");
        concertInfo.setArtistInfo(artistInfo);
        concertUpdateInfo = new ConcertUpdateInfo();
        concertUpdateInfo.setStartTime(timeFormatService.format("25.03.2019 20:12"));
        concertInfo.setConcertUpdateInfo(concertUpdateInfo);
        concertInfoMap.put("team", concertInfo);
    }

    public ConcertInfo getConcertInfo(String concertName) {
        return concertInfoMap.get(concertName);
    }
}
