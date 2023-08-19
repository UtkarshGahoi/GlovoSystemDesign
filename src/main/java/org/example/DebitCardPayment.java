package org.example;

public class DebitCardPayment implements Payment{
    String debitCardNumber;
    String cvvCode;
    String nameOnCard;

    public DebitCardPayment(String debitCardNumber, String cvvCode, String nameOnCard) {
        this.debitCardNumber = debitCardNumber;
        this.cvvCode = cvvCode;
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paying through debit card");
    }

}
