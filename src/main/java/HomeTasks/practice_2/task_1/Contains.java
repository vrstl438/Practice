package HomeTasks.practice_2.task_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Contains {
    private static HashSet <Integer> idEmployee = new HashSet<>();

    public static void addEmployees(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество добавляемых пользователей:");
        int count = scanner.nextInt();
        while (idEmployee.size() < count) {
            idEmployee.add((int) (Math.random() * 100));
        }
        System.out.println("Пользователь добавились!");
    }

    public static void printAllId(){
        System.out.println("Перечеь существующих ID");
        System.out.println(idEmployee);
    }

    public static void checkId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID пользователя");
        int numberId = scanner.nextInt();
        boolean check = idEmployee.contains(Integer.valueOf(numberId));
        if (check){
            System.out.println("Да, с таким ID пользователь существует");
        }else {
            System.out.println("С таким ID пользователя не существует");
        }
    }

}
