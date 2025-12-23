package HomeTasks.practice_1.OOP.task_7;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Attraction carusele = new Carusele();
        Attraction rollerCoaster = new RollerCoaster();

        park.setAttraction(rollerCoaster);
        park.printInfo();
    }
}
