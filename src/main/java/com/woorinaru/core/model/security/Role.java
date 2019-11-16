package com.woorinaru.core.model.security;

import com.woorinaru.core.model.user.Admin;
import com.woorinaru.core.model.user.Staff;
import com.woorinaru.core.model.user.Student;
import com.woorinaru.core.model.user.User;

import java.util.Objects;

public enum Role {
    ADMIN("admin"),
    LEADER("leader"),
    VICE_LEADER("vice_leader"),
    SUB_LEADER("sub_leader"),
    TEACHER("teacher"),
    STUDENT("student"),
    VISITOR("visitor");

    private String role;

    Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.role;
    }

    public static Role fromUser(User user) {
        if (Objects.isNull(user)) {
            return VISITOR;
        }

        if (user instanceof Admin) {
            return ADMIN;
        } else if (user instanceof Staff) {
            Staff staff = (Staff) user;

            if (Objects.isNull(staff.getStaffRole())) {
                return TEACHER;
            }

            switch (staff.getStaffRole()) {
                case LEADER:
                    return LEADER;
                case VICE_LEADER:
                    return VICE_LEADER;
                case SUB_LEADER:
                    return SUB_LEADER;
                case TEACHER:
                default:
                    return TEACHER;
            }
        } else if (user instanceof Student) {
            return STUDENT;
        }

        throw new IllegalArgumentException("Unknown user type");
    }

    public static Role fromRole(String role) {
        if (Objects.isNull(role)) {
            throw new IllegalArgumentException("Cannot map role from null");
        }

        switch(role) {
            case "admin":
                return ADMIN;
            case "leader":
                return LEADER;
            case "vice_leader":
                return VICE_LEADER;
            case "sub_leader":
                return SUB_LEADER;
            case "teacher":
                return TEACHER;
            case "student":
                return STUDENT;
            case "visitor":
                return VISITOR;
        }

        throw new IllegalArgumentException("Unknown user type");
    }
}
