package patterns.task4;

public class Sword implements Arms {
    private final int damage = 140;

    @Override
    public int attack(){
        return damage;
    }
}
