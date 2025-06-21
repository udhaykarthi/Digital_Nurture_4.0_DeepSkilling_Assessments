import java.util.Scanner;
public class SearchByLinear {
    public static void main(String[] args) {
      Inventory[] inventory = {
    new Inventory("Laptop", 1001, 999.99),
    new Inventory("Smartphone", 1002, 499.99),
    new Inventory("Tablet", 1003, 299.99),
    new Inventory("Smartwatch", 1004, 199.99),
    new Inventory("Headphones", 1005, 149.99),
    new Inventory("Wireless Mouse", 1006, 39.99),
    new Inventory("Mechanical Keyboard", 1007, 89.99),
    new Inventory("External Hard Drive", 1008, 79.99),
    new Inventory("Monitor", 1009, 179.99),
    new Inventory("Gaming Chair", 1010, 229.99),
    new Inventory("Webcam", 1011, 59.99),
    new Inventory("Printer", 1012, 129.99),
    new Inventory("Speakers", 1013, 99.99),
    new Inventory("Graphics Card", 1014, 349.99)
};

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the serial number (from 1001 to 1014): ");
        int searchSerialNumber = sc.nextInt();;
        boolean found = false;

        for (Inventory item : inventory) {
            if (item.serialNumber == searchSerialNumber) {
                System.out.println("Item found: " + item.itemName + ", Price: $" + item.price);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item with serial number " + searchSerialNumber + " not found.");
        }
    }
}
