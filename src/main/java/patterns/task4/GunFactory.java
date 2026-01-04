package patterns.task4;

public class GunFactory implements ArmsFactory{
    @Override
    public Arms createArms(){
        return new Gun();
    }
}
