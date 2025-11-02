package practice_1.OOP.task_1;

public class Zoo {
    static Animal animal;

    public static void addAnimal(Animal newAnimal){
        animal = newAnimal;
    }

    public static void behaviorAnimal(){
        animal.move();
        animal.voice();
    }
}
