package HomeTasks.Final_HomeTasks.Task_5;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Product {
    private String name;
    private int price;
    private String category;

    public Product(String name, int price, String category){
        if (price <= 0){
            throw new IllegalArgumentException("Цена должна быть больше 0");
        }
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
