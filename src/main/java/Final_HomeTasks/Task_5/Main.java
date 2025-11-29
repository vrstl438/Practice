package Final_HomeTasks.Task_5;

public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        inventoryService.isInventoryOpenSwitch(true);

        inventoryService.addProduct(new Product("Хлеб", 100, "Мучное"));
        inventoryService.addProduct(new Product("Булка", 50, "Мучное"));
        inventoryService.addProduct(new Product("Наполеон", 300, "Мучное"));

        inventoryService.addProduct(new Product("Яблоко", 40, "Фрукты"));
        inventoryService.addProduct(new Product("Киви", 120, "Фрукты"));
        inventoryService.addProduct(new Product("Банан", 90, "Фрукты"));


        System.out.println(inventoryService.filteredProductsAtPrice());
    }
}
