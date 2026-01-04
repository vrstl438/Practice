package patterns.task11;

public class Close implements Command{
    @Override
    public void start(){
        System.out.println("Дверь закрыта");
    }
}
