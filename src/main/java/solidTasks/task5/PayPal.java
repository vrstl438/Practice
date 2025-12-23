package solidTasks.task5;

public class PayPal implements PaymentsSystem{
    @Override
    public void pay(double amount){
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
