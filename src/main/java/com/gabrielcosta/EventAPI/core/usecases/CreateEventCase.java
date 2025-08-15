package com.gabrielcosta.EventAPI.core.usecases;

import com.gabrielcosta.EventAPI.core.entities.Event;

public interface CreateEventCase {
    public Event execute(Event event);
}
