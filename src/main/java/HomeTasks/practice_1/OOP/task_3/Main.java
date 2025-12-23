package HomeTasks.practice_1.OOP.task_3;

public class Main {
    public static void main(String[] args) {
        Dish coffee = new Drink("Coffee", 400);
        Dish omelette = new HotDish("Omelette", 80);
        Menu menu = new Menu();

        menu.addDish(coffee);
        menu.addDish(omelette);
        menu.showMenu();
    }
}
