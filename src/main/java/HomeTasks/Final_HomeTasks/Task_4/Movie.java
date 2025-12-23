package HomeTasks.Final_HomeTasks.Task_4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
public class Movie {
    private String title;

    @Override
    public String toString(){
        return title;
    }
}
