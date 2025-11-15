package createClassAndObjects;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String someOwner, int someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    //геттеры
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }

    //сеттер
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
        System.out.println("Баланс пользователя - " + this.owner + "   равен - " + this.balance);
    }

    public void withdraw(int amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.println("Баланс пользователя - " + this.owner + "   равен - " + this.balance);
        }else{
            System.out.println("У вас недостаточно средств");
        }

    }

    public void printBalance(){
        System.out.println("Ваш баланс равен: " + this.balance);
    }

}
