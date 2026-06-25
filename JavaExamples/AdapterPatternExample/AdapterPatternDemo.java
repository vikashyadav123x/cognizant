package AdapterPatternExample;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripePaymentAdapter(new StripeGateway());
        PaymentProcessor payPalProcessor = new PayPalPaymentAdapter(new PayPalGateway());

        stripeProcessor.processPayment();
        payPalProcessor.processPayment();
    }
}
