package M2C4.list;

import M2C4.list.classes.TaskManager;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        String task1 = "bFirstTask";
        String task2 = "aScondTask";
        String task3 = "ThirdTask";
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.markTaskAsCompleted(1);
        taskManager.removeTask(2);
        taskManager.printTaskList();

        // Verify if tasks list contains taks1
        if(taskManager.getTasks().contains(task3)){
            System.out.println("The tasks list contains: " + task3);
        } else {
            System.out.println("The tasks list not contains: " + task3);
        }

        // Verify if tasks list is empty
        if(taskManager.getTasks().isEmpty()){
            System.out.println("The tasks list is empty");
        }

        // Sort tasks list
        Collections.sort(taskManager.getTasks());
        taskManager.printTaskList();

        // Get array fron list of task
        Object[] arrayTasks = taskManager.getTasks().toArray();

    }
}
