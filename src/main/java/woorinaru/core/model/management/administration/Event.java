package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.user.Student;

import java.time.LocalDateTime;
import java.util.Collection;

public class Event implements Identifiable {

    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
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

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
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
}
