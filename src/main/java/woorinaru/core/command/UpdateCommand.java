package woorinaru.core.command;

public interface UpdateCommand<M> {
    void execute();
    M getReceiver();
    void setReceiver(M receiver);
}
