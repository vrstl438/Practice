package HomeTasks.practice_1.OOP.task_3;

public class Drink extends Dish {
    int volume;

    public Drink (String someName, int someVolume){
        this.name = someName;
        this.volume = someVolume;
    }

    @Override
    public void printInfo(){
            System.out.println(name + " объем - " + volume);
    }
}
