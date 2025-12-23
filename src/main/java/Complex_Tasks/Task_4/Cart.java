package Complex_Tasks.Task_4;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart {
    @Getter
    private static List<Product> productContainer = new ArrayList<>();

    public static void addProduct(Product product){
        productContainer.add(product);
    }

    public static void editCountProduct(String name, int count){
        productContainer.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .ifPresent(p -> p.setCount(count));
    }

    public static Double allCountProducts(){
        return productContainer.stream()
                .mapToDouble(product -> (double) product.getPrice() * product.getCount())
                .sum();
    }
}
