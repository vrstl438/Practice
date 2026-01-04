package patterns.task4;

public class Bow implements Arms{
    private final int damage = 110;

    @Override
    public int attack(){
        return damage;
    }
}
