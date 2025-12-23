package HomeTasks.practice_1.OOP.task_6;

public class Main {
    public static void main(String[] args) {
        GardenManager gardenManager = new GardenManager();
        Plants cactus = new Cactus();
        Plants orchid = new Orchid();

        gardenManager.setPlants(orchid);
        gardenManager.care();
    }
}
