package com.puzzle.server.controllers;

import com.puzzle.server.dto.ChatUpdateInfo;
import com.puzzle.server.dto.Message;
import com.puzzle.server.dto.MessageRequest;
import com.puzzle.server.dto.RegistrationResponse;
import com.puzzle.server.services.ChatService;
import com.puzzle.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("{concertName}")
@CrossOrigin
public class ChatController {

    @Autowired
    private UserService userService;

    @Autowired
    private ChatService chatService;

    @GetMapping("/registration/{userName}")
    public ResponseEntity<RegistrationResponse> registration(@PathVariable String concertName,
                                                             @PathVariable String userName) {
        return new ResponseEntity<>(new RegistrationResponse(userService.registerUser(userName, concertName)),
                HttpStatus.OK);
    }

    @PostMapping("/send-msg")
    public ResponseEntity<HttpStatus> sendMsg(@PathVariable String concertName,
                                              @RequestParam MessageRequest msgRequest) {
        Message message = new Message(Integer.parseInt(msgRequest.getUserId()),
                msgRequest.getText(),
                userService.getUserNameById(Integer.parseInt(msgRequest.getUserId()), concertName));
        chatService.addMessage(concertName, message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/chat-update")
    public ResponseEntity<ChatUpdateInfo> chatUpdate(@PathVariable String concertName) {
        return new ResponseEntity<>(chatService.getChatUpdateInfo(concertName),
                HttpStatus.OK);
    }

}
