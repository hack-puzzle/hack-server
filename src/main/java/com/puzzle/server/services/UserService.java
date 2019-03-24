package com.puzzle.server.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private int currentId = 0;

    private Map<String, Map<Integer, String>> userMap = new HashMap<>();

    @PostConstruct
    protected void init() {
        userMap.put("radiotapok", new HashMap<>());
        userMap.put("team", new HashMap<>());
    }

    public int registerUser(String userName, String concertName) {
        currentId++; // Next id
        userMap.get(concertName).put(currentId, userName);
        return currentId;
    }

    public String getUserNameById(int userId, String concertName) {
        return userMap.get(concertName).get(userId);
    }

}
