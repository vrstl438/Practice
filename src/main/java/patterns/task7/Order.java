package patterns.task7;

import lombok.ToString;

import java.util.List;

@ToString

public class Order {
    private final List<String> detailOrder;
    private final double discount;
    private final String payment;

    private Order (OrderBuilder orderBuilder){
        this.detailOrder = orderBuilder.detailOrder;
        this.discount = orderBuilder.discount;
        this.payment = orderBuilder.payment;
    }


    public static class OrderBuilder {
        private List<String> detailOrder;
        private double discount;
        private String payment;

        public OrderBuilder detailOrder(List<String> detailOrder){
            this.detailOrder = detailOrder;
            return this;
        }

        public OrderBuilder discount(double discount){
            this.discount = discount;
            return this;
        }

        public OrderBuilder payment(String payment){
            this.payment = payment;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
}
