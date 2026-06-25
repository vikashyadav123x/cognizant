package InventoryManagementExample;

public class InventoryDemo {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 75000));
        manager.addProduct(new Product(102, "Phone", 20, 30000));

        System.out.println("Initial inventory:");
        manager.displayInventory();

        manager.updateProduct(101, "Laptop Pro", 15, 80000);
        System.out.println("\nAfter update:");
        manager.displayInventory();

        manager.deleteProduct(102);
        System.out.println("\nAfter delete:");
        manager.displayInventory();
    }
}
