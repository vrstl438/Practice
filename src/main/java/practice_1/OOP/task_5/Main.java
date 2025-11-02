package practice_1.OOP.task_5;

import practice_1.OOP.task_2.Home;

public class Main {
    public static void main(String[] args) {
        Ferma ferma = new Ferma();
        HomeAnimals cow = new Cow();
        HomeAnimals chicken = new Chiсken();

        ferma.setHomeAnimals(cow);
        ferma.animalManager();
    }
}
