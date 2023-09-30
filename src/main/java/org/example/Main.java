package org.example;

import org.example.impl.OrderServiceImpl;
import org.example.impl.RestaurantServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RestaurantServiceImpl restaurantService=new RestaurantServiceImpl();
        User user=new User("utkarsh","utkershgahoi140@gmail.com","1234");

        List<String> dishNames = Arrays.asList(
                "Palak Paneer",
                "Fries",
                "Burger",
                "Coke",
                "Tiramisu",
                "Plain Dal"
        );
        List<Dish>dishes=new ArrayList<>();
        for (String name: dishNames) {
            dishes.add(new Dish(name,100.0));
        }
        Address address=new Address("172","Mahaveer Ganj");
        Restaurant restaurant=new Restaurant("Asha Bhojnalaya",address,dishes);
        restaurantService.addRestaurant(restaurant);
        restaurantService.addMenuToRestaurant(restaurant,dishes);

        Cart cart=new Cart();
        for(Dish dish:dishes) {
            cart.addItem(dish);
        }

        List<Dish> cart1 = cart.getCart();
        DebitCardPayment debitCardPayment=new DebitCardPayment("1234-5678-9012-3456", "12/25","utkarsh");
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setPaymentStrategy(debitCardPayment);
        OrderServiceImpl orderService=new OrderServiceImpl(paymentContext,cart1,restaurant);
        Invoice invoice = orderService.makeOrder(user);
        System.out.println("The restaurant name is "+invoice.restaurantName.getName()+ "\n"+
                "The user who placed the order is "+invoice.user.getName());
    }
}