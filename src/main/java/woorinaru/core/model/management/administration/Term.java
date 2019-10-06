package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.user.Staff;

import java.util.List;

public class Term implements Identifiable {

    private int id;
    private int term;
    private List<Staff> staffMembers;

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

    public void setStaffMembers(List<Staff> staffMembers) {
        this.staffMembers = staffMembers;
    }

    public List<Staff> getStaffMembers() {
        return staffMembers;
    }
}
