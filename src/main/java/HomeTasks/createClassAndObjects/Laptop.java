package HomeTasks.createClassAndObjects;

public class Laptop {
    String brand;
    int price;

    public Laptop(String someBrand, int somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    //геттеры
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    //сеттеры
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void printInfo(){
        System.out.println("Бренд ноутбука: " + this.brand + "    Цена ноутбука: " + this.price);
    }
}
