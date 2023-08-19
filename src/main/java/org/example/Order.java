package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    public void placeOrder(List<Dish>dishes,Address destinationAddress,Restaurant restaurant,Payment payment){
        Double finalAmount = 0.0;
        for(Dish dish:dishes){
            finalAmount+=dish.getPrice();
        }
        System.out.println("the final amunt is "+finalAmount);
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setPaymentStrategy(payment);
        paymentContext.processPayment(finalAmount);


    }
}
