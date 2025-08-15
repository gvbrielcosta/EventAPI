package com.gabrielcosta.EventAPI.core.usecases;

import com.gabrielcosta.EventAPI.core.entities.Event;

public interface SearchEventCase {
    Event execute(Event event);
}
