package org.example;

import java.util.List;

public class Restaurant {
    String name;
    Address address;
    List<Dish> dishes;

    public Restaurant(String name, Address address, List<Dish> dishes) {
        this.name = name;
        this.address = address;
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}

