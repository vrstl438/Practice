package practice_1.solver;

import java.util.Enumeration;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        MatchNumbers();
    }
    public static void PositiveNumber (){
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите положительное число");
            num = scanner.nextInt();
        }while (num < 0);
    }

    public static void Password(){
        Scanner scanner = new Scanner(System.in);
        String pass;
        System.out.println("Введите пароль!");
        do {
            pass = scanner.nextLine();
            if (!pass.equals("1234")){
                System.out.println("Неправильный пароль");
            }
        }while (!pass.equals("1234"));

        System.out.println("Вы вошли в систему!");
    }

    public static void InputNumbers(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }

    public static void Exit(){
        Scanner scanner = new Scanner(System.in);
        String key;
        do{
            System.out.println("Введите ключевое слово!");
            key = scanner.nextLine();
        }while (!key.equals("exit"));
    }

    public static void MatchNumbers(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        do {
            num = num / 10;
            count ++;
        }while (num != 0);
        System.out.println(count);
    }

}
