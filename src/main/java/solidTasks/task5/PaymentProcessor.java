package solidTasks.task5;

public class PaymentProcessor {
    public void processPayments(PaymentsSystem paymentsType, double amount) {
        paymentsType.pay(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayments(new Bitcoin(), 200);
        paymentProcessor.processPayments(new CreditCard(), 2020);
        paymentProcessor.processPayments(new PayPal(), 2121210);
    }
}
