package woorinaru.core.model.management.administration;

import woorinaru.core.model.user.Staff;

import java.time.LocalDate;
import java.util.Collection;

public class Term {

    private int term;
    private Collection<Staff> staffMembers;
    private LocalDate startDate;
    private LocalDate endDate;

    public Term() {}

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
}
