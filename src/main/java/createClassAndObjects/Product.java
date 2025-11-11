package createClassAndObjects;

public class Product {
    String name;
    double price;

    public Product(String someName, double somePrice){
        this.name = someName;
        this.price =  somePrice;
    }

    //геттеры
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    //сеттер
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void applyDiscount(int discount){
        if (discount <= 0 || discount > 100){
            System.out.println("!!!!Скидка может быть 1-100%!!!!");
        }else {
            double mathDiscount = ((double) price / 100) * discount;
            this.price = this.price - mathDiscount;
            System.out.println("Итоговая цена товара сотавляет - " + this.price);
        }
    }

    public void printInfo(){
        System.out.println("Название товара: " + this.name + "      Цена товара: " + this.price);
    }
}
