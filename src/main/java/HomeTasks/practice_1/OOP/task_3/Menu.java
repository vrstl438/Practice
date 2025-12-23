package HomeTasks.practice_1.OOP.task_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List <Dish> dishes = new ArrayList<>();

    public void addDish (Dish newDish){
        dishes.add(newDish);
    }

    public void showMenu(){
        for (Dish pointDish : dishes){
            pointDish.printInfo();
        }
    }
}
