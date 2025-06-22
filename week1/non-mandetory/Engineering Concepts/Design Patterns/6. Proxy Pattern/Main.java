public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("scenery.jpg");

        System.out.println("ProxyImage created.");

        System.out.println("\nFirst call to display():");
        img1.display();  

        System.out.println("\nSecond call to display():");
        img1.display(); 

        System.out.println("\nCreating another ProxyImage for same file:");
        Image img2 = new ProxyImage("scenery.jpg");
        img2.display();  
    }
}