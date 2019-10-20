package woorinaru.core.command.user;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.user.Staff;

public abstract class StaffUpdateCommand implements UpdateCommand<Staff> {

    protected Staff staff;

    public StaffUpdateCommand(Staff staff) {
        this.staff = staff;
    }

    @Override
    public Staff getReceiver() {
        return staff;
    }

    @Override
    public void setReceiver(Staff receiver) {
        this.staff = receiver;
    }
}
