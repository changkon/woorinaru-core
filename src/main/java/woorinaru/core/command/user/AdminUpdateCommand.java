package woorinaru.core.command.user;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.user.Admin;

public abstract class AdminUpdateCommand implements UpdateCommand<Admin> {
    protected Admin admin;

    public AdminUpdateCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public Admin getReceiver() {
        return admin;
    }

    @Override
    public void setReceiver(Admin receiver) {
        this.admin = receiver;
    }
}
