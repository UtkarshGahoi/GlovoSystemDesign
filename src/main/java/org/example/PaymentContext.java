package org.example;

public class PaymentContext {
    private Payment paymentStrategy;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
