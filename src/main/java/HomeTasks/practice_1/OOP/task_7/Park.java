package HomeTasks.practice_1.OOP.task_7;

public class Park {
    Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void printInfo(){
        attraction.feelings();
        attraction.service();
    }
}
