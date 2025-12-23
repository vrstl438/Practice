package HomeTasks.practice_1.OOP.task_5;

public class Cow implements HomeAnimals{
    @Override
    public void animalFunction(){
        System.out.println("Корова даёт молоко");
    }

    @Override
    public void animalNeed(){
        System.out.println("Корова нуждается в ввыпасе");
    }
}
