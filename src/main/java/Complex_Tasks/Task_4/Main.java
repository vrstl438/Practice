package Complex_Tasks.Task_4;
import static Complex_Tasks.Task_4.Cart.*;
import static Complex_Tasks.Task_4.ShopSystem.*;

public class Main {
    public static void main(String[] args) {
        addProduct(new Product("Apple", 1, 400));
        addProduct(new Product("Banana", 1, 300));
        addProduct(new Product("Meat", 2, 1000));

        editCountProduct("Meat", 120);

        System.out.println(allCountProducts());


        addProductAtStopList(new Product("Cheese"));

        System.out.println(chekSale());

        System.out.println(buyCart());
    }
}
