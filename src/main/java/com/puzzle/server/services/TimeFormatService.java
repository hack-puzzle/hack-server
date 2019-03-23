package com.puzzle.server.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Service
public class TimeFormatService {

    private static DateTimeFormatter jsonFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public String format(String time) {
        try {
            return jsonFormat.format(LocalDateTime.parse(time, formatter));
        } catch (DateTimeParseException ex) {
            ex.printStackTrace();
            return "2077-07-17 17:17:17";
        }
    }

    public String format(LocalDateTime time) {
        try {
            return jsonFormat.format(time);
        } catch (DateTimeParseException ex) {
            ex.printStackTrace();
            return "2077-07-17 17:17:17";
        }
    }
}
