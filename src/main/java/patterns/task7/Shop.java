package patterns.task7;

public class Shop {
    public Order createOrder(Order.OrderBuilder orderBuilder){
        return orderBuilder.build();
    }
}
