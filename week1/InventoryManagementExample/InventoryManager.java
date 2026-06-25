package InventoryManagementExample;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private final Map<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public Product getProduct(int productId) {
        return inventory.get(productId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println("ID: " + product.getProductId() +
                    ", Name: " + product.getProductName() +
                    ", Qty: " + product.getQuantity() +
                    ", Price: " + product.getPrice());
        }
    }
}
