package practice_1.OOP.task_2;

public class Dog implements Animal {

    @Override
    public void activity() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void eating() {
        System.out.println("Собака есть сухой корм");
    }
}
