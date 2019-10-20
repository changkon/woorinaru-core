package woorinaru.core.command.user;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.user.Student;

public abstract class StudentUpdateCommand implements UpdateCommand<Student> {

    protected Student student;

    public StudentUpdateCommand(Student student) {
        this.student = student;
    }

    @Override
    public Student getReceiver() {
        return this.student;
    }

    @Override
    public void setReceiver(Student receiver) {
        this.student = receiver;
    }
}
