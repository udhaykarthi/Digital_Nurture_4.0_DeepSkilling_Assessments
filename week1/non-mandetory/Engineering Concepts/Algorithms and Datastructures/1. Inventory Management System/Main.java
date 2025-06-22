public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);
        Product product3 = new Product(3, "Tablet", 15, 299.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.displayProducts();

        inventory.updateProduct(2, 18, 459.99);
        inventory.removeProduct(1);

        inventory.displayProducts();
    }
}
