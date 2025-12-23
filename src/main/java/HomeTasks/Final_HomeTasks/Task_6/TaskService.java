package HomeTasks.Final_HomeTasks.Task_6;

import lombok.Getter;
import lombok.Synchronized;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService <T> {
    @Getter
    private List<Task> taskContainer = new ArrayList<>();

    //метод для добавления
    public void addTask(Task task){
        for (Task t : taskContainer){
            if(t.getID() == task.getID() || t.getID().equals(task.getID())){
                throw new InvalidIDException("Нельзя добавить задачу с уже имеющимся ID");
            }
        }
        taskContainer.add(task);
    }

    //метод для удаления - синхронизированный
    @Synchronized
    public void deleteTask(T ID){
        if (!taskContainer.removeIf(task -> ID.equals(task.getID()) || ID == task.getID())){
            throw new InvalidIDException("такого ID не существует");
        }
    }

    //метод для фильтрации задач по статусу
    public List<Task> filteredForStatusAtTasks(boolean status){
        return taskContainer.stream()
                .filter(task -> task.isStatus() == status)
                .toList();
    }

    //метод фильтрации задач по приоритету
    public List<Task> filteredForPriorityAtTasks(int priority){
        return taskContainer.stream()
                .filter(task -> task.getPriority() == priority)
                .toList();
    }


    //метод сортировки задач по дате
    public List<Task> sortedForDateAtTask(){
        return taskContainer.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .toList();
    }

}
