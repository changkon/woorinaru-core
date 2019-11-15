package com.woorinaru.core.service.impl;

import com.woorinaru.core.model.user.Admin;
import com.woorinaru.core.model.user.Staff;
import com.woorinaru.core.model.user.StaffRole;
import com.woorinaru.core.model.user.Student;
import com.woorinaru.core.service.UserServiceImpl;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceImplTest {

    @Test
    public void testAdminIsAllowedToModifyUserType() {
        // GIVEN
        UserServiceImpl userService = new UserServiceImpl();
        Admin admin = new Admin();
        userService.setUserContext(admin);

        // WHEN
        boolean isAllowed = userService.isAllowedToModifyUserType(new Student(), Admin.class);

        // THEN
        assertThat(isAllowed).isTrue();
    }

    @Test
    public void testStudentIsNotAllowedToModifyUserType() {
        // GIVEN
        UserServiceImpl userService = new UserServiceImpl();
        Student student = new Student();
        userService.setUserContext(student);

        // WHEN
        boolean isAllowed = userService.isAllowedToModifyUserType(new Staff(), Student.class);

        // THEN
        assertThat(isAllowed).isFalse();
    }

    @Test
    public void testNonLeaderStaffIsNotAllowedToModifyUserType() {
        // GIVEN
        UserServiceImpl userService = new UserServiceImpl();
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.TEACHER);
        userService.setUserContext(staff);

        // WHEN
        boolean isAllowed = userService.isAllowedToModifyUserType(new Staff(), Student.class);

        // THEN
        assertThat(isAllowed).isFalse();
    }

    @Test
    public void testLeaderStaffIsAllowedToModifyUserType() {
        // GIVEN
        UserServiceImpl userService = new UserServiceImpl();
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.LEADER);
        userService.setUserContext(staff);

        // WHEN
        boolean isAllowed = userService.isAllowedToModifyUserType(new Staff(), Student.class);

        // THEN
        assertThat(isAllowed).isTrue();
    }

    @Test
    public void testLeaderStaffIsNotAllowedToModifyUserTypeToAdmin() {
        // GIVEN
        UserServiceImpl userService = new UserServiceImpl();
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.LEADER);
        userService.setUserContext(staff);

        // WHEN
        boolean isAllowed = userService.isAllowedToModifyUserType(new Staff(), Admin.class);

        // THEN
        assertThat(isAllowed).isFalse();
    }

}
