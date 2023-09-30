package org.example;

import java.util.List;

public interface OrderService {
    public Invoice makeOrder(User user);
    public boolean cancelOrder(String transactionId);

}
