package org.example;

public class Invoice {
    User user;
    String transactionID;
    Restaurant restaurantName;
    double amount;

    public Invoice(User user, String transactionID, Restaurant restaurantName, double amount) {
        this.user = user;
        this.transactionID = transactionID;
        this.restaurantName = restaurantName;
        this.amount = amount;
    }
}
