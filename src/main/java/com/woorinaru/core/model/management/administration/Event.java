package com.woorinaru.core.model.management.administration;

import com.woorinaru.core.model.base.Identifiable;
import com.woorinaru.core.model.user.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class Event implements Identifiable {

    private int id;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String address;
    private String description;
    private Collection<WooriClass> wooriClasses;
    private Collection<Student> studentReservations;

    public Event() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWooriClasses(Collection<WooriClass> wooriClasses) {
        this.wooriClasses = wooriClasses;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Collection<WooriClass> getWooriClasses() {
        return wooriClasses;
    }

    public Collection<Student> getStudentReservations() {
        return studentReservations;
    }

    public void setStudentReservations(Collection<Student> studentReservations) {
        this.studentReservations = studentReservations;
    }

    public boolean addWooriClass(WooriClass wooriClass) {
        if (wooriClasses == null) {
            this.wooriClasses = new ArrayList<>();
        }
        return this.wooriClasses.add(wooriClass);
    }

    public boolean addStudentReservation(Student student) {
        if (studentReservations == null) {
            this.studentReservations = new ArrayList<>();
        }

        return this.studentReservations.add(student);
    }

    public boolean removeWooriClass(int id) {
        if (wooriClasses == null) {
            return false;
        }
        return this.wooriClasses.removeIf(wClass -> wClass.getId() == id);
    }

    public boolean removeStudentReservation(int id) {
        if (studentReservations == null) {
            return false;
        }
        return this.studentReservations.removeIf(student -> student.getId() == id);
    }
}
