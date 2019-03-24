package com.puzzle.server.services;

import com.puzzle.server.dto.ChatUpdateInfo;
import com.puzzle.server.dto.Message;
import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class ChatService {

    @Getter
    private Map<String, ChatUpdateInfo> chatMap = new HashMap<>();

    @PostConstruct
    protected void init() {
        chatMap.put("radiotapok", new ChatUpdateInfo());
        chatMap.put("team", new ChatUpdateInfo());
    }

    public void addMessage(String concertName, Message message) {
        ChatUpdateInfo chatUpdateInfo = chatMap.get(concertName);
        chatUpdateInfo.getMsgList().add(message);
        if (chatUpdateInfo.getMsgList().size() > 30) {
            chatUpdateInfo.getMsgList().remove(0);
        }
    }

    public ChatUpdateInfo getChatUpdateInfo(String concertName) {
        return chatMap.get(concertName);
    }
}
