package patterns.task7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Order order1 = shop.createOrder(
                new Order.OrderBuilder()
                        .detailOrder(Arrays.asList("Milk"))
                        .discount(12.1)
                        .payment("MIR")
        );
        System.out.println(order1);
    }
}
