package HomeTasks.practice_2.task_2;

import java.util.Scanner;

public class TaskManager {

    public static void addTasks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 задачи");
        int counter = 0;
        while (true){
            counter++;
            String task = scanner.next();
            System.out.println("Задача " + "#-" + counter + " добалена");
            TaskContainer.setQueue(task);
            if (TaskContainer.getQueue().size() >= 3){
                System.out.println("_________________________");
                break;
            }
        }
    }

    public static void removeTask(){
        while (!TaskContainer.getQueue().isEmpty()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Список оставшихся задач!");
            for (String task : TaskContainer.getQueue()){
                System.out.println(task);
            }
            System.out.println("Нажмите 1 для удаления последней задачи");
            int one = scanner.nextInt();
            if (!TaskContainer.getQueue().isEmpty() && one == 1){
                System.out.println("Задача удалена");
                TaskContainer.remove();
            } else {
                System.out.println("Ошибка");
            }
            System.out.println("Все задачи отмечены!");
        }
    }

}
