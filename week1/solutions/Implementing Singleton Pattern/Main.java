public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger.log("test message 1");
        logger2.log("test message 2");
        if (logger == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
