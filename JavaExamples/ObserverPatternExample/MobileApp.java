package ObserverPatternExample;

public class MobileApp implements Observer {
    private final String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received update: " + stockName + " -> " + price);
    }
}
