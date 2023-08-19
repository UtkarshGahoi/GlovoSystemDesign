package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Dish>cart=new ArrayList<>();

    public void addItem(Dish dish){
        cart.add(dish);
    }
    public List<Dish>getCart(){
        return cart;
    }
}
