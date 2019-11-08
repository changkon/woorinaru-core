package com.woorinaru.core.command.management.administration;

import com.woorinaru.core.command.UpdateCommand;
import com.woorinaru.core.model.management.administration.Event;

public abstract class EventUpdateCommand implements UpdateCommand<Event> {

    protected Event event;

    public EventUpdateCommand(Event event) {
        this.event = event;
    }

    @Override
    public Event getReceiver() {
        return this.event;
    }

    @Override
    public void setReceiver(Event receiver) {
        this.event = receiver;
    }
}
