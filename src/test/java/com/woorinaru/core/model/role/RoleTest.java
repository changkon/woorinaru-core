package com.woorinaru.core.model.role;

import com.woorinaru.core.model.user.Admin;
import com.woorinaru.core.model.user.Staff;
import com.woorinaru.core.model.user.StaffRole;
import com.woorinaru.core.model.user.Student;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoleTest {

    @Test
    public void testAdminReturnsAdminRole() {
        // GIVEN
        Admin admin = new Admin();

        // WHEN
        Role role = Role.fromUser(admin);

        // THEN
        assertThat(role).isEqualTo(Role.ADMIN);
    }

    @Test
    public void testStudentReturnsStudentRole() {
        // GIVEN
        Student student = new Student();

        // WHEN
        Role role = Role.fromUser(student);

        // THEN
        assertThat(role).isEqualTo(Role.STUDENT);
    }

    @Test
    public void testViceLeaderStaffReturnsViceLeaderRole() {
        // GIVEN
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.VICE_LEADER);

        // WHEN
        Role role = Role.fromUser(staff);

        // THEN
        assertThat(role).isEqualTo(Role.VICE_LEADER);
    }

    @Test
    public void testSubLeaderStaffReturnsSubLeaderRole() {
        // GIVEN
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.SUB_LEADER);

        // WHEN
        Role role = Role.fromUser(staff);

        // THEN
        assertThat(role).isEqualTo(Role.SUB_LEADER);
    }

    @Test
    public void testTeacerStaffReturnsTeacherRole() {
        // GIVEN
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.TEACHER);

        // WHEN
        Role role = Role.fromUser(staff);

        // THEN
        assertThat(role).isEqualTo(Role.TEACHER);
    }

    @Test
    public void testLeaderStaffReturnsLeaderRole() {
        // GIVEN
        Staff staff = new Staff();
        staff.setStaffRole(StaffRole.LEADER);

        // WHEN
        Role role = Role.fromUser(staff);

        // THEN
        assertThat(role).isEqualTo(Role.LEADER);
    }

    @Test
    public void testNullStaffRoleReturnsTeacherRole() {
        // GIVEN
        Staff staff = new Staff();

        // WHEN
        Role role = Role.fromUser(staff);

        // THEN
        assertThat(role).isEqualTo(Role.TEACHER);
    }

}
