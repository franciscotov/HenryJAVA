package CRM2C4.intefaces;

import CRM2C4.classes.Course;
import CRM2C4.classes.Student;

import java.util.List;
import java.util.function.Predicate;

public interface Filtrable {
    public List<Student> filterStudents(List<Student> students, Predicate filter);

    public List<Course>  filterStudentAndCourses(List<Student> students, Predicate filter);

}
