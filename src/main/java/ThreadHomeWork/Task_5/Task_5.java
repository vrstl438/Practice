package ThreadHomeWork.Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task_5 {
    public static void main(String[] args) throws Exception {

        // Создаем пул из 4 потоков
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<String>> tasks = new ArrayList<>();

        // Добавляем 6 задач
        for (int i = 1; i <= 6; i++) {
            int taskId = i;
            tasks.add(() -> {
                Thread.sleep(2000); // задержка 2 секунды
                return "Задача " + taskId + " выполнена!";
            });
        }

        // Отправляем все задачи на выполнение
        List<Future<String>> results = executor.invokeAll(tasks);

        // Закрываем пул
        executor.shutdown();

        // Выводим результаты в главном потоке
        System.out.println("=== Результаты ===");
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
    }
}

