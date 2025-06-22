public class Main {

    public static void main(String[] args) {
        Orders[] orders = {
            new Orders(1, "Alice", 250.0),
            new Orders(2, "Bob", 150.0),
            new Orders(3, "Charlie", 300.0)
        };

        System.out.println("Before sorting:");
        for (Orders order : orders) {
            System.out.println(order);
        }

        Bubblesort.sort(orders);

        System.out.println("\nAfter sorting:");
        for (Orders order : orders) {
            System.out.println(order);
        }
    }
    
}
