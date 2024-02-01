package com.fasotroc.fasotroc.repository;

import com.fasotroc.fasotroc.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
}
