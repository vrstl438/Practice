package patterns.task12;

public class Security implements SmartHouse {
    @Override
    public void on() {
        System.out.println("Система безопасности включен");
    }

    @Override
    public void off() {
        System.out.println("Система безопасности выключен");
    }
}
