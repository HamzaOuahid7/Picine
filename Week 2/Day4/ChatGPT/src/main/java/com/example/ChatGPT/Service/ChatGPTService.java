package com.example.ChatGPT.Service;


import com.example.ChatGPT.Repository.ConversationRepository;
import com.example.ChatGPT.entitys.Conversation;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.theokanning.openai.OpenAiResponse;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChatGPTService { /// faut faire un interface 
    private ConversationRepository conversationRepository;
    public ChatGPTService(ConversationRepository conversationRepository){
        this.conversationRepository=conversationRepository;
    }
    @Value("${openaiToken}")
    String openaiToken;
    public String generatePrompt(String question) {
            //SpringApplication.run(OpenaiCompletionIoApplication.class, args);
            String token = openaiToken;

            if (token == null) {
                System.err.println("OPENAI_API_KEY environment variable not set"); // logger
                System.exit(1);///jamais
            }

            com.theokanning.openai.service.OpenAiService service = new OpenAiService(token);
            CompletionRequest completionRequest = CompletionRequest.builder()
                    .model("text-davinci-003")
                    .prompt(question)
                    .maxTokens(1000)
                    .echo(true)
                    .user("testing")
                    .n(1)
                    .build();
            String response = service.createCompletion(completionRequest).getChoices().get(0).getText().trim();
            Conversation conversation = new Conversation();
            conversation.setAnswer(response);
            conversation.setQuestion(question);
            conversation.setTimestamp(LocalDateTime.now());
            conversationRepository.save(conversation);
            System.out.println(response);
            return response;
        }

    public List<Conversation> getAllConversations() {
        return conversationRepository.findAll();
    }
}
