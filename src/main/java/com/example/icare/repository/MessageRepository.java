package com.example.icare.repository;

import com.example.icare.domain.Message;
import com.example.icare.domain.Nutritionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository//JPA Repository is mainly used for managing the data in a Spring Boot Application
public interface MessageRepository extends JpaRepository<Message, Long> {
}
