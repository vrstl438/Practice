package patterns.task4;

public class Main {
    public static void main(String[] args) {
        ArmsFactory gunFactory = new GunFactory();

        Arms gun = gunFactory.createArms();

        System.out.println(gun.attack());
    }
}
