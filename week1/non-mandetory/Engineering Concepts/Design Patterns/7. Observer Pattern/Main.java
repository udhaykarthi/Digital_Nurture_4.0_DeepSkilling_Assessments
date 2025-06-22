
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = new MobileApp("InvestorA");
        Observer webObserver = new WebApp("InvestorB");

        stockMarket.registerObserver(mobileObserver);
        stockMarket.registerObserver(webObserver);

        stockMarket.updateStockPrice("INFY", 1520.75);
        stockMarket.updateStockPrice("TCS", 3475.20);

        stockMarket.removeObserver(webObserver);

        stockMarket.updateStockPrice("RELIANCE", 2750.10);
    }
}
