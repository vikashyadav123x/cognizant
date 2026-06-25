package SearchAlgorithmExample;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Headphones", "Accessories"),
                new Product(104, "Keyboard", "Accessories"),
                new Product(105, "Mouse", "Accessories")
        };

        Product[] sortedProducts = products.clone();
        java.util.Arrays.sort(sortedProducts, java.util.Comparator.comparingInt(Product::getProductId));

        int targetId = 104;

        int linearIndex = SearchAlgorithms.linearSearch(products, targetId);
        int binaryIndex = SearchAlgorithms.binarySearch(sortedProducts, targetId);

        System.out.println("Linear search result: " + linearIndex);
        System.out.println("Binary search result: " + binaryIndex);
    }
}
