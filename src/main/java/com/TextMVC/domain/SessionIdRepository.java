package com.TextMVC.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SessionIdRepository extends JpaRepository<SessionId, Long> {
    Optional<SessionId> findById(Long id);
}
