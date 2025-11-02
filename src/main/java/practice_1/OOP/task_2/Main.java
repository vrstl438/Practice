package practice_1.OOP.task_2;

public class Main {
    public static void main(String[] args) {
        Home homeOne = new Home();
        Animal dog = new Dog();
        Animal cat = new Cat();

        homeOne.setAnimal(cat);
        homeOne.CareForAnimal();
    }
}
