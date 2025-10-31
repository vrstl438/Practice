package practice_1.solver;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        Countdown();
    }

    public static void Factorial(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

    public static void EvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        while(a < num){
            a++;
            if (a % 2 == 0){
                System.out.println(a);
            }
        }
    }

    public static void Countdown(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num >= 1){
            System.out.println(num);
            num--;
        }

    }
}
