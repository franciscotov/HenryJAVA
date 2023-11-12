package CRM2C4.classes;

import java.util.List;

public class Student {
    String name;
    int age;
    List<Course> courses;

    public Student(String name, int age, List<Course> course) {
        this.name = name;
        this.age = age;
        this.courses = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> course) {
        this.courses = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + courses +
                '}';
    }
}
