package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.user.Staff;
import woorinaru.core.model.user.Student;

import java.util.List;

public interface WooriClass extends Identifiable {
    String getGrade();
    List<Resource> getResources();
    List<Staff> getStaff();
    List<Student> getStudents();
}
