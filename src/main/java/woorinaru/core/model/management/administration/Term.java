package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.user.Staff;

import java.util.List;

public interface Term extends Identifiable {
    int getTerm();
    List<Staff> getStaffMembers();
}
