package practice_1.OOP.task_2;

public class Home {
    Animal animal;

    public void setAnimal(Animal newAnimal){
        this.animal = newAnimal;
    }

    public void CareForAnimal(){
        animal.activity();
        animal.eating();
    }
}
