package HomeTasks.practice_1.solver;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        RatingPoints();
    }


    public static void NumberCheck(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное!");
        } else if (number < 0) {
            System.out.println("Число отрицательное!");
        }else{
            System.out.println("Число равно нулю!");
        }
    }

    public static void MaxNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число!");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo){
            System.out.println("Первое число наибольшее! - " + numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Второе число наибольшее! - " + numberTwo);
        }else{
            System.out.println("Числа одинаковые!");
        }
    }

    public static void GradeNumber(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите число от 1 до 5!");
            int number = scanner.nextInt();
            if (number <= 5 && number > 0){
                switch (number){
                    case 5 -> System.out.println( "Отлично");
                    case 4 -> System.out.println("Хорошо");
                    case 3 -> System.out.println("Удовлетворительно");
                    case 2 -> System.out.println("Неудовлетворительно");
                    case 1 -> System.out.println("Неудовлетворительно");
                }
                break;
            }else{
                System.out.println("Вы ввели неправильное число! Диапазон 1-5 !!!");
            }
        }
    }

    public static void ParityCheck(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Число четное!");
        }else{
            System.out.println("Число нечетное!");
        }
    }

    public static void DiscountCalculation(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Скидка = 25%");
        } else if (age > 65) {
            System.out.println("Скидка = 30%");
        }else{
            System.out.println("Скидка не предусмотрена");
        }
    }

    public static void RatingPoints(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите баллы от 1-100");
            int points = scanner.nextInt();
            if (points <= 100){
                if (points >= 90){
                    System.out.println("Отлично");
                } else if (points >= 75) {
                    System.out.println("Хорошо");
                } else if (points >= 60){
                    System.out.println("Удовлетворительно");
                } else {
                    System.out.println("Неудовлетворительно");
                }
                break;
            }else{
                System.out.println("Введите правильно кол-во баллов!");
            }
        }
    }

}
