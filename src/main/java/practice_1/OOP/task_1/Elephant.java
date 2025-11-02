package practice_1.OOP.task_1;

public class Elephant extends Animal{
    @Override
    public void voice() {
        System.out.println("Слон трубит!");
    }

    @Override
    public void move(){
        System.out.println("Слон ходит!");
    }
}
