package patterns.task12;

public class Conditioning implements SmartHouse {
    @Override
    public void on() {
        System.out.println("Кондиционер включен");
    }

    @Override
    public void off() {
        System.out.println("Кондиционер выключен");
    }
}
