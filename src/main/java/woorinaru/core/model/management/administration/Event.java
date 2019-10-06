package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;

import java.time.LocalDateTime;
import java.util.List;

public class Event implements Identifiable {

    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String address;
    private String description;
    private List<WooriClass> wooriClasses;

    public Event() {}

    @Override
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

    public void setWooriClasses(List<WooriClass> wooriClasses) {
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

    public List<WooriClass> getWooriClasses() {
        return wooriClasses;
    }
}
