import java.util.Scanner;

public class SearchByBinary {
    public static void main(String[] args) {
         Inventory[] inventory = {
    new Inventory("Laptop", 1, 999.99),
    new Inventory("Smartphone", 2, 499.99),
    new Inventory("Tablet", 3, 299.99),
    new Inventory("Smartwatch", 4, 199.99),
    new Inventory("Headphones", 5, 149.99),
    new Inventory("Wireless Mouse", 6, 39.99),
    new Inventory("Mechanical Keyboard", 7, 89.99),
    new Inventory("External Hard Drive", 8, 79.99),
    new Inventory("Monitor", 9, 179.99),
    new Inventory("Gaming Chair", 10, 229.99),
    new Inventory("Webcam", 11, 59.99),
    new Inventory("Printer", 12, 129.99),
    new Inventory("Speakers", 13, 99.99),
    new Inventory("Graphics Card", 14, 349.99)
};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the serial number: ");
    int searchSerialNumber = sc.nextInt();
     int left = 0;
        int right = inventory.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (inventory[mid].serialNumber == searchSerialNumber) {
                System.out.println("Item found: " + inventory[mid].itemName + ", Price: $" + inventory[mid].price);
                found = true;
                break;
            } else if (inventory[mid].serialNumber < searchSerialNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Item with serial number " + searchSerialNumber + " not found.");
        }
}
}

