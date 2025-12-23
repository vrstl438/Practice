package HomeTasks.practice_1.OOP.task_2;

public class Cat implements Animal{

    @Override
    public void activity() {
        System.out.println("Кошка играет");
    }

    @Override
    public void eating() {
        System.out.println("Кошка есть влажный корм");
    }
}
