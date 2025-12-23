package solidTasks.task5;

public class CreditCard implements PaymentsSystem{
    @Override
    public void pay(double amount){
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
