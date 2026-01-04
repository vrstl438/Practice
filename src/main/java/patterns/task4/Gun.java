package patterns.task4;

public class Gun implements Arms {
    private final int damage = 80;

    @Override
    public int attack() {
        return damage;
    }
}