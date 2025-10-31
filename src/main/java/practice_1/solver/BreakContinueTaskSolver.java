package practice_1.solver;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        StringSkip();
    }

    public static void SumNumber(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Введите число");
            int a = scanner.nextInt();
            if (a < 0){
                break;
            }
            sum = sum + a;

            System.out.println(sum);
        }
    }

    public static void SkipNumber(){
        for (int i = 1; i <= 20 ; i++) {

            if (i % 3 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
    public static void PositiveNumber(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            int a = scanner.nextInt();

            if (a < 0){
                continue;
            }

            System.out.println(a);
        }
    }

    public static void StringSkip(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Введите строку");
            String a = scanner.next();

            if (a.equals("stop")){
                break;
            }
        }
    }
}


