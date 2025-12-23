package HomeTasks.createClassAndObjects;

public class Car {
    String brand;
    int year;

    public Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }
        //геттер
    public String getBrand(){
        return brand;
    }
    public int getYear() {
        return year;
    }
    //сеттеры
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }

    public void print(){
        System.out.println("Марка автомобиля: " + this.brand + "   Год выпуска: " + this.year);
    }
}
