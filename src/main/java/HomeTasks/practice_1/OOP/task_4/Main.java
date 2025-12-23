package HomeTasks.practice_1.OOP.task_4;

public class Main {
    public static void main(String[] args) {
        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();
        Aquarium aquarium = new Aquarium();


        aquarium.addSeaCreature(shark);
        aquarium.behavior();

        aquarium.addSeaCreature(starfish);
        aquarium.behavior();
    }
}
