package com.woorinaru.core.command.user;

import com.woorinaru.core.command.UpdateCommand;
import com.woorinaru.core.model.user.Admin;

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
