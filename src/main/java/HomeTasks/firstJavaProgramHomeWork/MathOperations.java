package HomeTasks.firstJavaProgramHomeWork;

public class MathOperations {

    //task-1
    public static int add(int x, int y){
        int result = x + y;
        System.out.println(result);
        return result;
    }

    public static int subtract(int x, int y){
        int result = x - y;
        System.out.println(result);
        return result;
    }

    public static int multiply(int x, int y){
        int result = x * y;
        System.out.println(result);
        return result;
    }

    public static double divide(int x, int y){
        if (y == 0){
            System.out.println("Деление на ноль невозможно");
            return 0;
        }
        double result = (double) x / y;
        System.out.println(result);
        return result;
    }

    //task-2
    public static int findMax(int a, int b){
        if (a > b){
            System.out.println(a);
            return a;
        } else if (b > a) {
            System.out.println(b);
            return b;
        } else {
            System.out.println("Числа одинаковые");
            return a;
        }
    }

    //task-3
    public static int difference(int x, int y){
        int result = Math.abs(x - y);
        System.out.println(result);
        return result;
    }

    //task-4
    public static int squareArea(int side){
        int area = side * side;
        System.out.println(area);
        return area;
    }

    public static int squarePerimeter(int side){
        int perimeter = side * 4;
        System.out.println(perimeter);
        return perimeter;
    }

    //task-5
    public static double convertSecondsToMinutes(int seconds){
        double min = (double) seconds / 60;
        System.out.println(min);
        return min;
    }

    //task-6
    public static double averageSpeed(double distance, double time) {
        if (time <= 0) {
            System.out.println("Время не может быть меньше или равно нулю!");
            return 0;
        }
        double result = distance / time;
        System.out.println(result);
        return result;
    }

    //task-7
    public static double findHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0){
            System.out.println("Введите положительные аргументы");
            return 0;
        }
        double result = Math.sqrt(a * a + b * b);
        System.out.println(result);
        return result;
    }

    //task-8
    public static double circleCircumference(double radius) {
        double result = 2 * Math.PI * radius;
        System.out.println(result);
        return result;
    }

    //task-9
    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            System.out.println("Значение total не может быть нулём");
            return 0;
        }
        double percent = (part / total) * 100;
        System.out.println(percent);
        return percent;
    }

    //task-10
    public static double celsiusToFahrenheit(double c) {
        double result = c * 9 / 5 + 32;
        System.out.println(result);
        return result;
    }

    public static double fahrenheitToCelsius(double f) {
        double result = (f - 32) * 5 / 9;
        System.out.println(result);
        return result;
    }
}