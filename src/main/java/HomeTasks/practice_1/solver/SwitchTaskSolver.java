package HomeTasks.practice_1.solver;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        Calculate();
    }

    public static void SelectDayOnWeek(){
        Scanner scanner = new Scanner(System.in);
        int dayNumber;
        do {
            System.out.println("Введите цифру соответствующую дню недели! 1 - 7");
            dayNumber = scanner.nextInt();
            if (dayNumber < 0 || dayNumber > 7){
                System.out.println("Введите корректное число!");
            }
        }while (dayNumber < 0 || dayNumber > 7);

        switch (dayNumber){
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }
    }

    public static void BiletSale(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int day = scanner.nextInt();
            if (day <= 7 && day > 0){
                switch (day){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Стоимость билета - 300 рублей");
                        break;
                    case 6:
                    case 7:
                        System.out.println("Стоимость билета - 450 рублей");
                        break;
                }
                break;
            }else{
                System.out.println("Введите корректный день недели");
            }
        }
    }

    public static void NumberToLetter(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int number = scanner.nextInt();
            if(number <= 100 && number >= 0){
                if (number >= 90){
                    System.out.println("A");
                } else if (number >= 80) {
                    System.out.println("B");
                } else if (number >= 70) {
                    System.out.println("C");
                } else if (number >= 60) {
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }
                break;
            }else {
                System.out.println("Вы ввели некорректное число!");
            }
        }
    }

    public static void TextCommand(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите команду!");
            System.out.println("start");
            System.out.println("stop");
            System.out.println("restart");
            System.out.println("status");

            String command = scanner.nextLine();
            switch (command){
                case "start":
                    System.out.println("Система запущена");
                    break;
                case "stop":
                    System.out.println("Система приостановлена");
                    break;
                case "restart":
                    System.out.println("Система перезапускается");
                    break;
                case "status":
                    System.out.println("Система в порядке");
                    break;
                default:
                    System.out.println("Вы ввели неправильную команду!");
                    continue;
            }
            break;
        }
    }

    public static void Calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Укажите оператор (+, -, *, /)");
        scanner.nextLine();
        String operator = scanner.nextLine();

        switch (operator){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0){
                    System.out.println("Делить на ноль нельзя!");
                }else {
                    System.out.println((double)a / b);
                }
                break;
            default:
                System.out.println("Вы ввели неправильный оператор!");
        }
    }




}
