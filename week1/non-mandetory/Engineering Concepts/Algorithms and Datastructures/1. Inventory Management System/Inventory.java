import java.util.HashMap;

public class Inventory {
    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        if(products.containsKey(product.productId)) {
            System.out.println("Product with ID " + product.productId + " already exists.");
        } else {
            products.put(product.productId, product);
            System.out.println("Product added: " + product);
        }
    }
    public void removeProduct(int productId) {
        if(products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("No product found with ID " + productId);
        }
    }
      public void updateProduct(int productId, int quantity, double price) {
        Product p = products.get(productId);
        if (p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }
    public void displayProducts() {
        if(products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for(Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
}
