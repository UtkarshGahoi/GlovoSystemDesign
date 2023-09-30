package org.example.impl;

import org.example.Dish;
import org.example.Restaurant;
import org.example.RestaurantService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantServiceImpl implements RestaurantService {
    private List<Restaurant> restaurantList=new ArrayList<>();
    private Map<Restaurant,List<Dish>> dishList=new HashMap<>();

    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);

    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }
    public List<Restaurant> getRestaurantList(){
        return restaurantList;
    }
    public  void addMenuToRestaurant(Restaurant restaurant,List<Dish>dishes){
        dishList.put(restaurant,dishes);
    }

}

