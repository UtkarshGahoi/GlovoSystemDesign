package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantList {
   private Map<Restaurant,List<Dish>>dishList=new HashMap<>();
   private List<Restaurant>restaurantList=new ArrayList<>();
   public  void addMenuToRestaurant(Restaurant restaurant,List<Dish>dishes){
     dishList.put(restaurant,dishes);
   }
   public List<Dish> getListForRestaurant(Restaurant restaurant){
      if(dishList.containsKey(restaurant)){
          return dishList.get(restaurant);
      }
      return null;
   }
   public void allRestaurants(Restaurant restaurant){
       restaurantList.add(restaurant);
   }
   public List<Restaurant> getRestaurantList(){
       return restaurantList;
   }

}
