package firstJavaProgramHomeWork;

public class MathOperations {
    //task-1
    public static void add(int x, int y){
        System.out.println(x + y);
    }

    public static void subtract(int x, int y){
        System.out.println(x - y);
    }

    public static void multiply(int x, int y){
        System.out.println(x * y);
    }

    public static void divide(int x, int y){
        System.out.println(x / y);
    }

    //task-2
    public static void findMax(int a, int b){
        if (a > b){
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        }else {
            System.out.println("Числа одинковые");
        }
    }

    //task-3
    public static void difference(int x, int y){
        if (x >= y){
            System.out.println(x - y);
        } else {
            System.out.println(y -x);
        }
    }

    //task-4
    public static void squareArea(int side){
        int area = side * side;
        System.out.println(area);
    }

    public static void squarePerimeter(int side){
        int perimeter = side * 4;
        System.out.println(perimeter);
    }

    //task-5
    public static void convertSecondsToMinutes(int seconds){
        double min = (double) seconds / 60;
        System.out.println(min);
    }

    //task-6
    public static void averageSpeed(double distance, double time) {
        if (time <= 0) {
            System.out.println("Время не может быть меньше нуля!");
        }else{
            System.out.println(distance / time);
        }
    }

    //task-7
    public static void findHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0){
            System.out.println("Введите положительные аргументы");
        }else {
            System.out.println( Math.sqrt(a * a + b * b));
        }
    }

    //task-8
    public static void circleCircumference(double radius) {
        System.out.println(2 * Math.PI * radius);
    }

    //task-9
    public static void calculatePercentage(double total, double part) {
        if (total == 0) {
            System.out.println("нельзя вводить ноль");
        }
        System.out.println((part / total) * 100);
    }

    //task-10
    public static void celsiusToFahrenheit(double c) {
        System.out.println(c * 9 / 5 + 32);
    }

    public static void fahrenheitToCelsius(double f) {
        System.out.println((f - 32) * 5 / 9);
    }
}
