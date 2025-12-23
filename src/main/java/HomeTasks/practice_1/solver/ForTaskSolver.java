package HomeTasks.practice_1.solver;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        InputNumber();
    }

    public static void OutputNumbers() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void SumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void SimpleNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1){
            isPrime = false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }else {
                isPrime = true;
            }
        }
        if (isPrime){
            System.out.println("Простое");
        }else {
            System.out.println("Сложное");
        }
    }

    public static void InputNumber(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}