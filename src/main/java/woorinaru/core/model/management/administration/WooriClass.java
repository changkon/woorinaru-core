package woorinaru.core.model.management.administration;

import woorinaru.core.model.user.Staff;
import woorinaru.core.model.user.Student;

import java.util.Collection;

public abstract class WooriClass {

    protected Collection<Resource> resources;
    protected Collection<Staff> staff;
    protected Collection<Student> students;

    public WooriClass() {}

    public Collection<Resource> getResources() {
        return resources;
    }

    public Collection<Staff> getStaff() {
        return staff;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setResources(Collection<Resource> resources) {
        this.resources = resources;
    }

    public void setStaff(Collection<Staff> staff) {
        this.staff = staff;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public abstract Grade getGrade();

}
