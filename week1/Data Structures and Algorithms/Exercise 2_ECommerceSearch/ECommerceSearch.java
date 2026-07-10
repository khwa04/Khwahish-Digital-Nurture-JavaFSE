import java.util.Arrays;

// Setup: Product class
class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + productId + ", Name='" + productName + '\'' + ", Category='" + category + '\'' + '}';
    }

    // Required to easily sort the array for Binary Search
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
}

public class ECommerceSearch {

    // Implementation: Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.getProductId() == targetId) {
                return p; // Product found
            }
        }
        return null; // Product not found
    }

    // Implementation: Binary Search
    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = sortedProducts[mid].getProductId();

            if (midId == targetId) {
                return sortedProducts[mid]; // Product found
            }
            if (midId < targetId) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return null; // Product not found
    }

    public static void main(String[] args) {
        // Sample data
        Product[] inventory = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Mechanical Keyboard", "Electronics"),
            new Product(109, "Coffee Maker", "Home Appliances"),
            new Product(103, "Ergonomic Chair", "Furniture"),
            new Product(107, "Running Shoes", "Apparel")
        };

        int searchId = 107;

        // Linear Search Execution (Works on unsorted arrays)
        System.out.println("--- Linear Search ---");
        Product foundLinear = linearSearch(inventory, searchId);
        System.out.println("Result: " + (foundLinear != null ? foundLinear : "Not found"));

        // Binary Search Execution (Requires a sorted array)
        System.out.println("\n--- Binary Search ---");
        // We must sort the array first before binary search can work
        Arrays.sort(inventory); 
        Product foundBinary = binarySearch(inventory, searchId);
        System.out.println("Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}