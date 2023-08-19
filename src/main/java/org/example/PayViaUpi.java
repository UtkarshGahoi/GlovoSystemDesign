package org.example;

public class PayViaUpi implements Payment{
    String UPIid;

    public PayViaUpi(String UPIid) {
        this.UPIid = UPIid;
    }

    @Override
    public void pay(double amount) {

    }


}
