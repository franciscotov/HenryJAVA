package M2C4.map;

import M2C4.map.classes.StudentRecord;
import M2C4.set.classes.PartyGuestList;

public class Main {

    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();
        String student1 = "a-student";
        String student2 = "b-student";
        String student3 = "c-student";
        Integer qualification1 = 10;
        Integer qualification2 = 20;
        Integer qualification3 = 30;

        // Adding students
        studentRecord.addStudent(student1, qualification1);
        studentRecord.addStudent(student2, qualification2);
        studentRecord.addStudent(student3, qualification3);

        // Verify if a student is in the map
        System.out.println("The student " + student2 + " is in the list: " + studentRecord.isStudentInRecord(student2));

        // Get student is qualification
        System.out.println("The student " + student1 + " is in the list: " + studentRecord.getGrade(student1));

        // Deleting a student
        studentRecord.removeStudent(student3);

        // Verify if a student's qualification is in the map
        System.out.println("The student " + qualification1 + " is in the list: " + studentRecord.containsValue(qualification1));

        // Get student's keys
        System.out.println("The student " + studentRecord.getStudentsNames());
    }
}
