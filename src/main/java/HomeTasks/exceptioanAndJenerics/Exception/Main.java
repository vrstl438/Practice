package HomeTasks.exceptioanAndJenerics.Exception;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            CreatingAndUsingYourOwnUnCheckedException();
        } catch (InvalidEmail e){
            System.out.println(e.getMessage());
        }

    }

    public static void handlingCheckedException() {
        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("Файл не найден!" + e.getMessage());
        }
    }


    public static void HandlingAnUncheckedException() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делать нельзя!" + e.getMessage());
        }
    }

    public static void CreatingAndUsingYourOwnCheckedException() throws InvalidYears {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18 || age > 150) {
            throw new InvalidYears("Подходящий возраст 18-150 лет!");
        }
        System.out.println("Вы проходите!");
    }

    public static void CreatingAndUsingYourOwnUnCheckedException () throws InvalidEmail{
        Scanner scanner = new Scanner (System.in);
        String email = scanner.next();
        if (!email.equals("qwerty@gmail.com")){
            throw new InvalidEmail("Вы ввели неккоректный адрес");
        }else {
            System.out.println("Вы подходите!");
        }
    }
}
