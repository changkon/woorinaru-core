package com.woorinaru.core.command.management.administration;

import com.woorinaru.core.command.UpdateCommand;
import com.woorinaru.core.model.management.administration.IntermediateClass;

public abstract class IntermediateClassUpdateCommand implements UpdateCommand<IntermediateClass> {

    protected IntermediateClass intermediateClass;

    public IntermediateClassUpdateCommand(IntermediateClass intermediateClass) {
        this.intermediateClass = intermediateClass;
    }

    @Override
    public IntermediateClass getReceiver() {
        return this.intermediateClass;
    }

    @Override
    public void setReceiver(IntermediateClass receiver) {
        this.intermediateClass = receiver;
    }
}
