package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDetails {
    User user;
    String transactionID;
    List<Dish>dishList=new ArrayList<>();

    private Map<User,List<Dish>>orderInfo=new HashMap<>();

    public OrderDetails(User user, String transactionID, List<Dish> dishList) {
        this.user = user;
        this.transactionID = transactionID;
        this.dishList = dishList;
        orderInfo.put(user,dishList);
    }

}
