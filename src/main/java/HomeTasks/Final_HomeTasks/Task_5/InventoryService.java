package HomeTasks.Final_HomeTasks.Task_5;

import lombok.Getter;

import java.util.*;

public class InventoryService {
    boolean isInventoryOpen;

    public boolean getIsInventoryOpen(){
        return this.isInventoryOpen;
    }

    @Getter
    private Map<String, List<Product>> productContainer = new HashMap<>();

    public void isInventoryOpenSwitch (boolean j){
        this.isInventoryOpen = j;
    }

    public void addProduct(Product product){
        if(isInventoryOpen){
            productContainer.computeIfAbsent(product.getCategory(), a -> new ArrayList<>())
                    .add(product);
        }
    }

    public List<Product> getProductForCategory(String category){
        if (productContainer.get(category) == null || productContainer.get(category).isEmpty()){
            throw new OutOfStockException("Категория пустая, товаров нет!");
        }
        return productContainer.get(category);
    }

    public List<Product> filteredProductsAtPrice(){
        List<Product> allProducts = new ArrayList<>();
        productContainer.values().forEach(allProducts::addAll);
        allProducts.sort(Comparator.comparing(Product::getPrice).reversed());
        return allProducts;
    }
}
