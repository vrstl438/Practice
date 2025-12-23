package solidTasks.task5;

public class Bitcoin implements PaymentsSystem{
    @Override
    public void pay(double amount){
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
