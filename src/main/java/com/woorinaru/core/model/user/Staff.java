package com.woorinaru.core.model.user;

import com.woorinaru.core.model.management.administration.Team;

public class Staff extends User {

    private StaffRole staffRole;
    private Team team;

    public Staff() {}

    public StaffRole getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(StaffRole staffRole) {
        this.staffRole = staffRole;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
