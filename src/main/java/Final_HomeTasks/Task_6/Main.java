package Final_HomeTasks.Task_6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task(12, false, 1, LocalDate.now()));
        taskService.addTask(new Task(13, true, 2, LocalDate.of(2024, 11, 29)));
        taskService.addTask(new Task(14, true, 3, LocalDate.of(2003, 9, 22)));
        taskService.addTask(new Task(15, false, 4, LocalDate.now()));

        taskService.deleteTask(1);

        System.out.println(taskService.filteredForStatusAtTasks(true));

        System.out.println(taskService.filteredForPriorityAtTasks(2));

        System.out.println(taskService.sortedForDateAtTask());
    }
}
