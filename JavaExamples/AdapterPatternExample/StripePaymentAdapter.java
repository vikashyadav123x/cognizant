package AdapterPatternExample;

public class StripePaymentAdapter implements PaymentProcessor {
    private final StripeGateway stripeGateway;

    public StripePaymentAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment() {
        stripeGateway.chargeCard("100 USD");
    }
}
