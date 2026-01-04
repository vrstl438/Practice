package patterns.task10;

public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(100);

        Distance adapter = new MilesToKilometersAdapter(miles);

        System.out.println(adapter.getValue());

    }
}
