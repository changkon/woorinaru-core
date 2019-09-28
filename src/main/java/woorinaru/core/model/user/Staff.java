package woorinaru.core.model.user;

import woorinaru.core.model.management.administration.Team;

public interface Staff extends User {
    StaffRole getRole();
    Team getTeam();
}
