package M2C4.list.classes;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<String> tasks = new ArrayList<>();

    public void addTask(String task){
        this.tasks.add(task);
    }

    public void markTaskAsCompleted(int index){
        String task = this.tasks.get(index);
        task = task.concat("-complete");
        this.tasks.set(index, task);
    }

    public void removeTask(int index){
        this.tasks.remove(index);
    }

    public void printTaskList(){
        System.out.println("The list of task has a length: " + this.tasks.size());
        for(String task: this.tasks){
            System.out.println(task);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}
