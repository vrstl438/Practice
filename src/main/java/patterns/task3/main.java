package patterns.task3;

public class main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        TransportFactory bicycleFactory = new BicycleFactory();

        Transport car = carFactory.createTransport();
        Transport bicycle = bicycleFactory.createTransport();

        car.drive();
        bicycle.drive();
    }
}
