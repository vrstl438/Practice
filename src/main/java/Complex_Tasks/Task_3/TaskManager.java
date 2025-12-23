package Complex_Tasks.Task_3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<TaskModel> taskContainer = new ArrayList<>();

    public void addTask(TaskModel task){
        taskContainer.add(task);
    }

    public List<TaskModel> filteredTasksForStatus(boolean status){
        return taskContainer.stream()
                .filter(t -> t.isStatus() == status)
                .toList();
    }

    public List<TaskModel> filteredTasksForPriority(int priority){
        return taskContainer.stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }

    public List<TaskModel> sortedForPriority(){
        return taskContainer.stream()
                .sorted(Comparator.comparing(TaskModel::getPriority))
                .toList();
    }
}