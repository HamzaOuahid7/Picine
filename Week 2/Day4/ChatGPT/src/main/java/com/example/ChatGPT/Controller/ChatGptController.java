package com.example.ChatGPT.Controller;

import com.example.ChatGPT.entitys.Conversation;

import com.example.ChatGPT.Repository.ConversationRepository;
import com.example.ChatGPT.Service.ChatGPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatGptController {
    private ChatGPTService chatGPTService;

    public ChatGptController (ChatGPTService chatGPTService) {
        this.chatGPTService= chatGPTService;
    }

        @PostMapping("/prompts")
        public String generatePrompt(@RequestParam String question) {
            return chatGPTService.generatePrompt(question);
        }

        @GetMapping("/conversations")
        public List<Conversation> getAllConversations() {
        return chatGPTService.getAllConversations();
        }
}
