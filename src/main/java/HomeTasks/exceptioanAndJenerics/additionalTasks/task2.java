package HomeTasks.exceptioanAndJenerics.additionalTasks;

import java.util.List;

public class task2 {

    public static <T> void printList(List<T>baseList){
        for (T chars : baseList){
            System.out.println(chars);
        }
    }
}
