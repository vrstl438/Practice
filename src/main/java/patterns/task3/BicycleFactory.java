package patterns.task3;

public class BicycleFactory implements TransportFactory{
    @Override
    public Transport createTransport(){
        return new Bicycle();
    }
}
