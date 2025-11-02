package practice_1.OOP.task_8;

public class Museum {
    Exhibits exhibits;

    public void setExhibits(Exhibits exhibits){
        this.exhibits = exhibits;
    }

    public void printInfo(){
        exhibits.requirements();
    }
}
