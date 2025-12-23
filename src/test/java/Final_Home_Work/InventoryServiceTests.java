package Final_Home_Work;

import HomeTasks.Final_HomeTasks.Task_5.InventoryService;
import HomeTasks.Final_HomeTasks.Task_5.OutOfStockException;
import HomeTasks.Final_HomeTasks.Task_5.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTests {
    private InventoryService inventoryService;

    @BeforeEach
    void preSet(){
        inventoryService = new InventoryService();
        inventoryService.isInventoryOpenSwitch(true);
    }

    @DisplayName("addProductTests Добавление") @Test
    void addProductsTest(){
        inventoryService.addProduct(new Product("Хлеб", 100, "Мучное"));
        inventoryService.addProduct(new Product("Булка", 50, "Мучное"));
        inventoryService.addProduct(new Product("Наполеон", 300, "Мучное"));
        inventoryService.addProduct(new Product("Апельсин", 300, "Фрукты"));

        assertEquals(3, inventoryService.getProductForCategory("Мучное").size());
        assertFalse(inventoryService.getProductContainer().size() == inventoryService.getProductForCategory("Мучное").size());
    }

    @DisplayName("addProductTests Добавление при отрицательной цене или нулевой цене") @Test
    void addProductsNegativeTest(){
        assertThrows(IllegalArgumentException.class, () -> inventoryService.addProduct(new Product("Хлеб", -20, "Мучное")));
        assertThrows(IllegalArgumentException.class, () -> inventoryService.addProduct(new Product("Хлеб", 0, "Мучное")));
    }

    //getProductForCategory
    @DisplayName("getProductForCategory - Проверка результата по категории") @Test
    void getProductForCategoryTest(){
        inventoryService.addProduct(new Product("Хлеб", 100, "Мучное"));
        inventoryService.addProduct(new Product("Булка", 50, "Мучное"));
        inventoryService.addProduct(new Product("Наполеон", 300, "Мучное"));

        inventoryService.addProduct(new Product("Яблоко", 40, "Фрукты"));
        inventoryService.addProduct(new Product("Киви", 120, "Фрукты"));
        inventoryService.addProduct(new Product("Банан", 90, "Фрукты"));

        assertEquals(3, inventoryService.getProductForCategory("Мучное").size());
        assertEquals(3, inventoryService.getProductForCategory("Фрукты").size());

        assertEquals("Мучное", inventoryService.getProductForCategory("Мучное").get(0).getCategory());
        assertEquals("Фрукты", inventoryService.getProductForCategory("Фрукты").get(2).getCategory());
    }

    @DisplayName("getProductForCategory - Проверка результата по несуществующей категории") @Test
    void getProductForNullCategoryTest(){
        inventoryService.addProduct(new Product("Наполеон", 300, "Мучное"));
        inventoryService.addProduct(new Product("Яблоко", 40, "Фрукты"));

        assertThrows(OutOfStockException.class, () -> inventoryService.getProductForCategory("Рыба"));
    }

    //filteredProductsAtPrice
    @DisplayName("getProductForCategory - Проверка результата по категории") @Test
    void filteredProductsAtPriceTest () {
        inventoryService.addProduct(new Product("Хлеб", 100, "Мучное"));
        inventoryService.addProduct(new Product("Булка", 50, "Мучное"));
        inventoryService.addProduct(new Product("Наполеон", 300, "Мучное"));
        inventoryService.addProduct(new Product("Ягодный торт", 300, "Мучное"));

        inventoryService.addProduct(new Product("Яблоко", 40, "Фрукты"));
        inventoryService.addProduct(new Product("Киви", 120, "Фрукты"));
        inventoryService.addProduct(new Product("Банан", 90, "Фрукты"));

        assertEquals(300, inventoryService.filteredProductsAtPrice().get(0).getPrice());
        assertEquals(300, inventoryService.filteredProductsAtPrice().get(1).getPrice());

        assertEquals(40, inventoryService.filteredProductsAtPrice().get(inventoryService.filteredProductsAtPrice().size() -1).getPrice());
    }

    @DisplayName("Проверка метода isInventoryOpenSwitch") @Test
    void isInventoryOpenSwitchTests(){
        inventoryService.isInventoryOpenSwitch(true);
        assertTrue(inventoryService.getIsInventoryOpen());
        inventoryService.isInventoryOpenSwitch(false);
        assertFalse(inventoryService.getIsInventoryOpen());
    }

}
