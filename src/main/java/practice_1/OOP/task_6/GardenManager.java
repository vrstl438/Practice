package practice_1.OOP.task_6;

public class GardenManager {
    Plants plants;

    public void setPlants(Plants newPlants){
        this.plants = newPlants;
    }

    public void care (){
        plants.careCriteria();
    }
}
