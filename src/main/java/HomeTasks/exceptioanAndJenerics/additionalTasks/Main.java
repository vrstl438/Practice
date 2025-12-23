package HomeTasks.exceptioanAndJenerics.additionalTasks;

import java.util.List;
import java.util.Scanner;

public class Main {

    public<T extends Number> void sumAray(List<T> array){
        Double sum = 0.0;
        for (T a : array){
            sum += a.doubleValue();
        }
        System.out.println(sum);
    }

    public void addNumbers(List<? super Integer> array){
        Scanner scanner = new Scanner(System.in);
        array.add(scanner.nextInt());
        array.add(scanner.nextInt());
    }
}
