package woorinaru.core.model.management.administration;

import woorinaru.core.model.user.Staff;

import java.util.List;

public interface Term {
    int getTerm();
    List<Staff> getStaffMembers();
}
