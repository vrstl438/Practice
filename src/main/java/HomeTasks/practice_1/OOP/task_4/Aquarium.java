package HomeTasks.practice_1.OOP.task_4;

public class Aquarium {
    SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature someSeaCreature){
        this.seaCreature = someSeaCreature;
    }

    public void behavior(){
        seaCreature.creatureBehavior();
    }
}
