package patterns.task11;

public class Open implements Command{
    @Override
    public void start(){
        System.out.println("Дверь открыта");
    }
}
