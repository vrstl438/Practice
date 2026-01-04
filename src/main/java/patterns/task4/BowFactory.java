package patterns.task4;

public class BowFactory implements ArmsFactory{
    @Override
    public Arms createArms(){
        return new Bow();
    }
}
