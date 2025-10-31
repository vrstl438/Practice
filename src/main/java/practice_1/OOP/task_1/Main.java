package practice_1.OOP.task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal bird = new Elephant();
        zoo.setAnimal(bird);
        zoo.showAnimalBehavior();

    }
}
