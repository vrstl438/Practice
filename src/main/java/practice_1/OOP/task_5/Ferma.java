package practice_1.OOP.task_5;

public class Ferma {
    HomeAnimals homeAnimals;

    public void setHomeAnimals(HomeAnimals someHomeAnimal){
        this.homeAnimals = someHomeAnimal;
    }

    public void animalManager(){
        homeAnimals.animalFunction();
        homeAnimals.animalNeed();
    }
}
