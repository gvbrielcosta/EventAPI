package com.gabrielcosta.EventAPI.core.usecases;

import com.gabrielcosta.EventAPI.core.entities.Event;

public class CreateEventCaseImpl implements CreateEventCase {
    @Override
    public Event execute(Event event) {
        return event;
    }
}
