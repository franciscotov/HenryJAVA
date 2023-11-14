package M2C4.map.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRecord {

    Map<String, Integer> students = new HashMap<>();

    public void addStudent(String name, Integer qualification){
        students.put(name, qualification);
    }

    public void removeStudent(String name){
        students.remove(name);
    }

    public Integer getGrade(String name){
        return students.get(name);
    }

    public boolean isStudentInRecord(String name){
        return students.containsKey(name);
    }

    public boolean containsValue(Integer qualification){
        return students.containsValue(qualification);
    }

    public Set<String> getStudentsNames(){
        return students.keySet();
    }
}
