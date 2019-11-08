package com.woorinaru.core.command.management.administration;

import com.woorinaru.core.command.UpdateCommand;
import com.woorinaru.core.model.management.administration.OutingClass;

public abstract class OutingClassUpdateCommand implements UpdateCommand<OutingClass> {

    protected OutingClass outingClass;

    public OutingClassUpdateCommand(OutingClass outingClass) {
        this.outingClass = outingClass;
    }

    @Override
    public OutingClass getReceiver() {
        return this.outingClass;
    }

    @Override
    public void setReceiver(OutingClass receiver) {
        this.outingClass = receiver;
    }
}
