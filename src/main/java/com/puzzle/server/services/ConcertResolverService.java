package com.puzzle.server.services;

import com.puzzle.server.dto.ConcertInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertResolverService {

    @Autowired
    private ConcertService concertService;

    public ConcertInfo getConcertInfo(String concertName) {
        return concertService.getConcertInfo(concertName);
    }


}
