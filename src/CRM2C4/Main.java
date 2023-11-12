package CRM2C4;

import CRM2C4.classes.Constants;
import CRM2C4.classes.Course;
import CRM2C4.classes.Student;
import CRM2C4.intefaces.implementation.FiltrableImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        FiltrableImpl filtrableImpl = new FiltrableImpl();

        List<Student> students = new ArrayList<Student>();
        Course course1 = new Course(Constants.JAVA_NAME);
        Course course2 = new Course(Constants.JAVASCRIPT_NAME);
        Course course3 = new Course(Constants.INTRODUCTION_TO_PROGRAMMING_NAME);
        Course course4 = new Course(Constants.WEB_PROGRAMMING_NAME);
        List<Course> courses1 = new ArrayList<>();
        List<Course> courses2 = new ArrayList<>();
        courses1.add(course1);
        courses1.add(course3);
        courses1.add(course4);

        courses2.add(course2);
        courses2.add(course4);


        students.add(new Student("fran", 23, courses1));
        students.add(new Student("cris", 25, courses1));
        students.add(new Student("fabian", 27, courses2));
        students.add(new Student("name1", 18, courses1));
        students.add(new Student("name2", 20, courses2));
        Predicate<Student> containCourse = st -> st.getCourses().contains(course3);

        for(Student student: students) {
            if(containCourse.test(student)) {
                System.out.println(student);
            }
        }

        Predicate<Student> filter =  student -> student.getAge() >= 25;
        List<Student> filterStudents = filtrableImpl.filterStudents(students, filter);

        System.out.println("Students by filter student.getAge() >= 25: ");
        for(Student student: filterStudents) {
            System.out.println(student);
        }

        Predicate<Student> filter2 =  containCourse;
        List<Student> filterStudents2 = filtrableImpl.filterStudents(students, filter2);

        System.out.println("Students by filter containCourse: ");
        for(Student student: filterStudents2) {
            System.out.println(student);
        }

        String nameByFilter = "fran";
        Predicate<Student> filter3 =  student -> student.getName() == nameByFilter;
        List<Course> studentCourses = filtrableImpl.filterStudentAndCourses(students, filter3);

        System.out.println("Courses of student " + nameByFilter + ": ");
        for(Course studentCourse : studentCourses) {
            System.out.println(studentCourse);
        }

    }
}
