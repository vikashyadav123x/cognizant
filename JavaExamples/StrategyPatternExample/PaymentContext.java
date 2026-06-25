package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment strategy selected");
        }
        paymentStrategy.pay();
    }
}
