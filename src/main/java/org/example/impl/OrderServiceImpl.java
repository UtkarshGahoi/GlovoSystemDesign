package org.example.impl;

import org.example.*;

import java.util.List;
import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    private PaymentContext paymentContext;
    private List<Dish> cartList;
    private  Restaurant restaurant;

    public OrderServiceImpl(PaymentContext paymentContext,List<Dish>dishes,Restaurant restaurant){
        this.paymentContext=paymentContext;
        this.cartList=dishes;
        this.restaurant=restaurant;
    }
    @Override
    public Invoice makeOrder(User user) {
        double totalPrice = cartList.stream()
                .mapToDouble(Dish::getPrice) // Extract the price from each Order
                .sum();
        try {
            paymentContext.processPayment(totalPrice);
            Invoice invoice = new Invoice(user, UUID.randomUUID().toString(), this.restaurant, totalPrice);
            OrderDetails orderDetails = new OrderDetails(user, UUID.randomUUID().toString(), cartList);
            return invoice;
        }
        catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

    @Override
    public boolean cancelOrder(String transactionId) {
        return false;
    }
}
