package com.woorinaru.core.model.management.administration;

import com.woorinaru.core.model.base.Identifiable;
import com.woorinaru.core.model.user.Staff;
import com.woorinaru.core.model.user.Student;

import java.util.ArrayList;
import java.util.Collection;

public abstract class WooriClass implements Identifiable {

    protected int id;
    protected Collection<Resource> resources;
    protected Collection<Staff> staff;
    protected Collection<Student> students;
    protected Event event;

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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean addResource(Resource resource) {
        if (resources == null) {
            resources = new ArrayList<>();
        }
        return resources.add(resource);
    }

    public boolean addStaff(Staff staff) {
        if (this.staff == null) {
            this.staff = new ArrayList<>();
        }
        return this.staff.add(staff);
    }

    public boolean addStudent(Student student) {
        if (students == null) {
            this.students = new ArrayList<>();
        }
        return this.students.add(student);
    }

    public boolean removeResource(int id) {
        if (resources == null) {
            return false;
        }
        return resources.removeIf(resource -> resource.getId() == id);
    }

    public boolean removeStaff(int id) {
        if (staff == null) {
            return false;
        }
        return this.staff.removeIf(staff -> staff.getId() == id);
    }

    public boolean removeStudent(int id) {
        if (students == null) {
            return false;
        }
        return this.students.removeIf(student -> student.getId() == id);
    }

    public abstract Grade getGrade();

}
