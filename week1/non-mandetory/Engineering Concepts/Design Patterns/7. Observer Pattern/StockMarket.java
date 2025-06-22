import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double price) {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }


    public void updateStockPrice(String stockName, double price) {
        System.out.println("Stock Update: " + stockName + " = ₹" + price);
        notifyObservers(stockName, price);
    }
}
