package HomeTasks.Final_HomeTasks.Task_6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Task <T>{
    private final T ID;
    private boolean status;
    private int priority;
    private LocalDate date;

    public Task(T ID, boolean status, int priority, LocalDate date){
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }
}
