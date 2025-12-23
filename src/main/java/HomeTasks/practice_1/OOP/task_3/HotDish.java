package HomeTasks.practice_1.OOP.task_3;

public class HotDish extends Dish{
    int temperature;

    public HotDish (String someName, int someTemperature){
        this.name = someName;
        this.temperature = someTemperature;
    }

    @Override
    public void printInfo(){
        System.out.println(name + " температруа блюда - " + temperature);
    }
}
