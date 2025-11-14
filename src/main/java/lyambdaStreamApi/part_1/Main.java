package lyambdaStreamApi.part_1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        //task-1
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(addition.operation(6, 3));
        System.out.println(subtraction.operation(6, 3));
        System.out.println(multiplication.operation(6, 3));
        System.out.println(division.operation(6, 3));


        //task-2
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        runnable.run();


        //task-3
        IntPredicate predicate = a -> {
            if (a % 2 == 0){
                System.out.println("Четное");
                return true;
            }else {
                System.out.println("Нечетное");
                return false;
            }
        };
        predicate.test(2);
        predicate.test(3);

        //task-4
        Function<String, Integer> function = a -> a.length();
        System.out.println(function.apply("qwfdfd"));

        //task-5
        Consumer consumer = a -> System.out.println(a);
        consumer.accept("qwerty");
    }
}
