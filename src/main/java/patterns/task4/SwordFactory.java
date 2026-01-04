package patterns.task4;

public class SwordFactory implements ArmsFactory{
    @Override
    public Arms createArms(){
        return new Sword();
    }
}
