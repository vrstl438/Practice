package Complex_Tasks.Task_5;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
public class Message {
    private String message;

    @Override
    public String toString(){
        return message;
    }
}
