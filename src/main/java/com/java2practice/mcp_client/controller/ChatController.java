package com.java2practice.mcp_client.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatClient chatClientWithoutToolsSupport;

    public ChatController(ChatClient chatClientWithoutToolsSupport) {
        this.chatClientWithoutToolsSupport = chatClientWithoutToolsSupport;
    }

    @PostMapping("/ask")
    String chat(@RequestBody String userInput) {
        return chatClientWithoutToolsSupport.prompt(userInput).call().content();
    }
}
