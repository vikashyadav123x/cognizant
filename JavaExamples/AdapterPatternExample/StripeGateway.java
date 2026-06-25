package AdapterPatternExample;

public class StripeGateway {
    public void chargeCard(String amount) {
        System.out.println("Charging card through Stripe: " + amount);
    }
}
