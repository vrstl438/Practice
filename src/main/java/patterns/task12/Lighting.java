package patterns.task12;

public class Lighting implements SmartHouse {
    @Override
    public void on() {
        System.out.println("Свет включен");
    }

    @Override
    public void off() {
        System.out.println("Свет выключен");
    }
}
