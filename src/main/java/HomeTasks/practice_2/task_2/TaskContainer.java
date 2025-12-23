package HomeTasks.practice_2.task_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskContainer {
    private static ArrayDeque <String> queue = new ArrayDeque<>();

    public static void setQueue(String task){
        queue.add(task);
    }

    public static ArrayDeque<String> getQueue(){
        return queue;
    }

    public static void remove(){
        queue.remove();
    }
}
