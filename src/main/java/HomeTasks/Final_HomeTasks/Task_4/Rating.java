package HomeTasks.Final_HomeTasks.Task_4;

import lombok.Getter;
import lombok.ToString;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Getter
@ToString
public class Rating <T extends Number>{
    private final T rating;

    public Rating(T rating){
        if (rating.doubleValue() < 1 || rating.doubleValue() > 10){
            throw new IllegalArgumentException("Диапазон от 1 до 10");
        }
        this.rating = rating;
    }
}
