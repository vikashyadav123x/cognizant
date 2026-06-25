package AdapterPatternExample;

public class PayPalPaymentAdapter implements PaymentProcessor {
    private final PayPalGateway payPalGateway;

    public PayPalPaymentAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment() {
        payPalGateway.makePayment(100.0);
    }
}
