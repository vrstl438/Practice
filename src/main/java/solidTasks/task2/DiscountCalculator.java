package solidTasks.task2;

public class DiscountCalculator {
    final double LOYAL_AND_FIRST_PURCHASE = 0.10;
    final double LOYAL = 0.05;
    final double COUPON = 0.07;
    final double NOT_COUPON = 0.02;

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount;

        if (isLoyalCustomer && isFirstPurchase) {
            discount = LOYAL_AND_FIRST_PURCHASE;
        } else if (isLoyalCustomer) {
            discount = LOYAL;
        } else if (hasCoupon) {
            discount = COUPON;
        } else {
            discount = NOT_COUPON;
        }

        return price * (1 - discount);
    }
}
