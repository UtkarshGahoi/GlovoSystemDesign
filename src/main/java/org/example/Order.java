package org.example;

<<<<<<< HEAD
import java.math.BigDecimal;
=======
>>>>>>> bb5aad9 (Glovo system design)
import java.util.List;

public class Order {
    public void placeOrder(List<Dish>dishes,Address destinationAddress,Restaurant restaurant,Payment payment){
        Double finalAmount = 0.0;
        for(Dish dish:dishes){
<<<<<<< HEAD
            finalAmount+=dish.getPrice();
=======
//            finalAmount+=dish.getPrice();
>>>>>>> bb5aad9 (Glovo system design)
        }
        System.out.println("the final amunt is "+finalAmount);
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setPaymentStrategy(payment);
        paymentContext.processPayment(finalAmount);


    }
}
