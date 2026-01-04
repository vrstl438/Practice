package patterns.task3;

public class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport(){
        return new Car();
    }
}
