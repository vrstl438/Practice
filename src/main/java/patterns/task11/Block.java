package patterns.task11;

public class Block implements Command{
    @Override
    public void start(){
        System.out.println("Дверь заблокирована");
    }
}
