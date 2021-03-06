package com.woorinaru.core.model.management.administration;

import com.woorinaru.core.model.base.Identifiable;
import com.woorinaru.core.model.user.Staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Term implements Identifiable {

    private int id;
    private int term;
    private Collection<Staff> staffMembers;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Event> events;

    public Term() {}

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setStaffMembers(Collection<Staff> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public Collection<Staff> getStaffMembers() {
        return staffMembers;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean addEvent(Event event) {
        if (events == null) {
            events = new ArrayList<>();
        }
        return events.add(event);
    }

    public boolean removeEvent(int id) {
        if (events == null) {
            return false;
        }
        return events.removeIf(event -> event.getId() == id);
    }

    public boolean addStaff(Staff staff) {
        if (staffMembers == null) {
            staffMembers = new ArrayList<>();
        }
        return staffMembers.add(staff);
    }

    public boolean removeStaff(int id) {
        if (staffMembers == null) {
            return false;
        }
        return staffMembers.removeIf(staff -> staff.getId() == id);
    }
}
