package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.user.Staff;
import woorinaru.core.model.user.Student;

import java.util.List;

public abstract class WooriClass implements Identifiable {

    protected int id;
    protected List<Resource> resources;
    protected List<Staff> staff;
    protected List<Student> students;

    public WooriClass() {}

    @Override
    public int getId() {
        return id;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public abstract Grade getGrade();

}
