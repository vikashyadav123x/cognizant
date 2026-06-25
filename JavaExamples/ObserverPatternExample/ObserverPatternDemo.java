package ObserverPatternExample;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 201.25);

        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice("GOOG", 175.50);
    }
}
