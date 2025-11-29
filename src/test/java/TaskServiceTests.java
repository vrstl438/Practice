import Final_HomeTasks.Task_6.InvalidIDException;
import Final_HomeTasks.Task_6.Task;
import Final_HomeTasks.Task_6.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


import java.util.List;

public class TaskServiceTests {
    private TaskService<Object> taskService;

    @BeforeEach
    void setUp(){
        taskService = new TaskService();

        taskService.addTask(new Task(1, true, 1, LocalDate.of(2025, 11, 29)));
        taskService.addTask(new Task(2, false, 2, LocalDate.of(2025, 11, 28)));
        taskService.addTask(new Task(3, true, 2, LocalDate.of(2025, 11, 30)));
    }

    @DisplayName("Добавление задач") @Test
    void addTaskTest(){
        assertEquals(3, taskService.getTaskContainer().size());
    }

    @DisplayName("Добавление задачи с дубликатом ID") @Test
    void addTaskDuplicateIDTests(){
        assertThrows(InvalidIDException.class, () -> taskService.addTask(new Task(1, true, 1, LocalDate.of(2025, 11, 29))));
        assertEquals(3, taskService.getTaskContainer().size());
    }



    @DisplayName("Удаление задач") @Test
    void deleteTaskTest(){
        taskService.deleteTask(1);
        assertEquals(2, taskService.getTaskContainer().size());
        assertTrue(taskService.getTaskContainer().stream().noneMatch(t -> t.getID().equals(1)));
    }

    @DisplayName("Удаление по несуществующему ID") @Test
    void deleteTaskNullID(){
        assertThrows(InvalidIDException.class, () -> taskService.deleteTask(5));
    }




    @DisplayName("Фильтрация по статусу true") @Test
    void filteredForStatusTrueAtTasksTest(){
        assertEquals(2, taskService.filteredForStatusAtTasks(true).size());
        assertTrue(taskService.filteredForStatusAtTasks(true).get(0).isStatus());
    }

    @DisplayName("Фильтрация по статусу false") @Test
    void filteredForStatusFalseAtTasksTest(){
        assertEquals(1, taskService.filteredForStatusAtTasks(false).size());
        assertFalse(taskService.filteredForStatusAtTasks(false).get(0).isStatus());
    }




    @DisplayName("Фильтрация по приоритету") @Test
    void filteredForPriorityAtTasksTest(){
        assertEquals(2, taskService.filteredForPriorityAtTasks(2).size());
        assertEquals(1, taskService.filteredForPriorityAtTasks(1).size());

        assertEquals(1, taskService.filteredForPriorityAtTasks(1).get(0).getPriority());
        assertEquals(2, taskService.filteredForPriorityAtTasks(2).get(0).getPriority());
    }


    @DisplayName("Сортировка по дате") @Test
    void sortedForDateAtTaskTest(){
        assertEquals(2, taskService.sortedForDateAtTask().get(0).getID());
        assertEquals(1, taskService.sortedForDateAtTask().get(1).getID());
        assertEquals(3, taskService.sortedForDateAtTask().get(2).getID());
    }
}
