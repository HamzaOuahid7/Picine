package com.example.ChatGPT.Repository;
import com.example.ChatGPT.entitys.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}