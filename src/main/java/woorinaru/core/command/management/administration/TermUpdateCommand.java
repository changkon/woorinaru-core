package woorinaru.core.command.management.administration;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.management.administration.Term;

public abstract class TermUpdateCommand implements UpdateCommand<Term> {

    protected Term term;

    public TermUpdateCommand(Term term) {
        this.term = term;
    }

    @Override
    public Term getReceiver() {
        return this.term;
    }

    @Override
    public void setReceiver(Term receiver) {
        this.term = receiver;
    }
}
