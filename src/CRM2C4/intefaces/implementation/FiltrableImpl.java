package CRM2C4.intefaces.implementation;

import CRM2C4.classes.Course;
import CRM2C4.classes.Student;
import CRM2C4.intefaces.Filtrable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltrableImpl implements Filtrable {
    @Override
    public List<Student> filterStudents(List<Student> students, Predicate filter) {
        List<Student> filterStudents = new ArrayList<>();
        for(Student student: students) {
            if(filter.test(student)){
                filterStudents.add(student);
            }
        }
        return filterStudents;
    }

    @Override
    public List<Course> filterStudentAndCourses(List<Student> students, Predicate filter) {
        for(Student student: students) {
            if(filter.test(student)){
                List<Course> studentCourses = student.getCourses();
                return studentCourses.stream().collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }
}
