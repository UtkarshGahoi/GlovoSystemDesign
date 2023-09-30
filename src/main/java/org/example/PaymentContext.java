package org.example;

public class PaymentContext {
    private Payment paymentStrategy;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
<<<<<<< HEAD
=======
        System.out.println("The amount for the order is "+amount);
>>>>>>> bb5aad9 (Glovo system design)
        paymentStrategy.pay(amount);
    }
}
