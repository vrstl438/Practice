package Complex_Tasks.Task_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TaskModel {
    private int priority;
    private String description;
    private boolean status;
}