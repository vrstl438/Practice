package practice_1.OOP.task_1;

public class Zoo {
    Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public void showAnimalBehavior(){
        animal.makeSound();
        animal.move();
    }

}
