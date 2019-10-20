package woorinaru.core.command.management.administration;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.management.administration.BeginnerClass;

public abstract class BeginnerClassUpdateCommand implements UpdateCommand<BeginnerClass> {

    protected BeginnerClass beginnerClass;

    public BeginnerClassUpdateCommand(BeginnerClass beginnerClass) {
        this.beginnerClass = beginnerClass;
    }

    @Override
    public BeginnerClass getReceiver() {
        return this.beginnerClass;
    }

    @Override
    public void setReceiver(BeginnerClass receiver) {
        this.beginnerClass = receiver;
    }
}
