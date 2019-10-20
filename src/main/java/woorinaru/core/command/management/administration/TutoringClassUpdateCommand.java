package woorinaru.core.command.management.administration;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.management.administration.TutoringClass;

public abstract class TutoringClassUpdateCommand implements UpdateCommand<TutoringClass> {

    protected TutoringClass tutoringClass;

    public TutoringClassUpdateCommand(TutoringClass tutoringClass) {
        this.tutoringClass = tutoringClass;
    }

    @Override
    public TutoringClass getReceiver() {
        return this.tutoringClass;
    }

    @Override
    public void setReceiver(TutoringClass receiver) {
        this.tutoringClass = receiver;
    }
}
