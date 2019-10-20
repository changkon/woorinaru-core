package woorinaru.core.command.management.administration;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.management.administration.IntermediateClass;

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
