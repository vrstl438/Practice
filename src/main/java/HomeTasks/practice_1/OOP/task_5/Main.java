package HomeTasks.practice_1.OOP.task_5;

public class Main {
    public static void main(String[] args) {
        Ferma ferma = new Ferma();
        HomeAnimals cow = new Cow();
        HomeAnimals chicken = new Chiсken();

        ferma.setHomeAnimals(cow);
        ferma.animalManager();
    }
}
