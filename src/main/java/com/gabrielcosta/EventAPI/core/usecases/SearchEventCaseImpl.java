package com.gabrielcosta.EventAPI.core.usecases;

import com.gabrielcosta.EventAPI.core.entities.Event;

public class SearchEventCaseImpl implements SearchEventCase {
    @Override
    public Event execute(Event event) {
        return event;
    }
}
