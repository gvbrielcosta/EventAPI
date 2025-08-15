package com.gabrielcosta.EventAPI.core.entities;

import com.gabrielcosta.EventAPI.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime initDate,
        LocalDateTime endDate,
        String local,
        String organizer,
        EventType type
        ) {}
