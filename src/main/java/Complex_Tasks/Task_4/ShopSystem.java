package Complex_Tasks.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static Complex_Tasks.Task_4.Cart.*;

public class ShopSystem {
    private static List<Product> stopList = new ArrayList<>();

    public static void addProductAtStopList(Product product) {
        stopList.add(product);
    }

    public static Double chekSale() {
        if (allCountProducts() >= 1000) {
            return allCountProducts() * 0.9;
        } else {
            return allCountProducts();
        }
    }

    public static boolean buyCart() {
        Set<String> cartNames = Cart.getProductContainer().stream()
                .map(Product::getName)
                .collect(Collectors.toSet());

        return !stopList.stream()
                .anyMatch(product -> cartNames.contains(product.getName()));
    }
}