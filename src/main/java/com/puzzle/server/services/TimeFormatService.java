package com.puzzle.server.services;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class TimeFormatService {

    private static SimpleDateFormat jsonFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    public String format(String time) {

        try {
            return jsonFormat.format(simpleDateFormat.parse(time));
        } catch (ParseException e) {
            return "2019-11-11T11:11:11";
        }
    }
}
