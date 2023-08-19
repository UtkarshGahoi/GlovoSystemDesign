package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user=new User("utkarsh","utkershgahoi140@gmail.com","1234");
        Dish dish=new Dish("palak paneer",128.0);
        Dish dish1=new Dish("shahi paneer",233.0);
        List<Dish>dishes=new ArrayList<>();
        dishes.add(dish1);
        dishes.add(dish);
        Address address=new Address("172","mahaveer ganj");
        Restaurant restaurant=new Restaurant("asha bhojnalaya",address,dishes);
        RestaurantList restaurantList=new RestaurantList();
        restaurantList.addMenuToRestaurant(restaurant,dishes);

        restaurantList.allRestaurants(restaurant);


        User user1=new User("Rajershi","rajershi@gmail.com","1234");
        Dish dish11=new Dish("masala chicken",128.0);
        Dish dish12=new Dish("prons",233.0);
        List<Dish>dishList=new ArrayList<>();
        dishList.add(dish11);
        dishList.add(dish12);
        Address newaddress=new Address("173","mahaveer ganj");
        Restaurant newrestaurant=new Restaurant("Bhai bhojnalaya",newaddress,dishList);
        restaurantList.addMenuToRestaurant(newrestaurant,dishList);

        restaurantList.allRestaurants(newrestaurant);


        boolean b = User.validateAccount("rajershi@gmail.com", "1234444");
        List<Restaurant> restaurantList2 = restaurantList.getRestaurantList();
        System.out.println("here is the list"+restaurantList2.size());
        for(Restaurant restaurant1:restaurantList2){
            System.out.println(restaurant1.getName());
        }
        System.out.println(b);

//
//        List<Dish> listForRestaurant = restaurantList.getListForRestaurant(restaurant);
//        for(Dish dish2:listForRestaurant){
//            System.out.println(dish2.getPrice());
//            System.out.println(dish2.getDishName());
//        }
//        Cart cart=new Cart();
//        cart.addItem(dish);
//        cart.addItem(dish1);
//        List<Dish> cart1 = cart.getCart();
//        Order order=new Order();
//        DebitCardPayment debitCardPayment=new DebitCardPayment("1234-5678-9012-3456", "12/25","utkarsh");
//        order.placeOrder(cart1,address,restaurant,debitCardPayment);


    }
}