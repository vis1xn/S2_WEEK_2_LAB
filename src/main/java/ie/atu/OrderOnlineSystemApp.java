package ie.atu;

import java.awt.*;

public class OrderOnlineSystemApp {

    public static void main(String[] args){

        MenuItem[] menuItems = new MenuItem[]{
                new Burger("Classic Burger", 7.99, "Beef patty, lettuce, tomato, cheese, pickles"),
                new Pizza("Pepperoni Pizza", 13.99, "pepperoni, cheese, tomato sauce"),
                new Salad("Caeser Salad", 4.99, "Romaine lettuce, tomatoes, croutons, 1000 Ilse dressing"),
                new Dessert("Chocolate Cake", 15.69, "Eggs, Milk, Chocolate powder, Yeast")
        };

        for (MenuItem menuItem : menuItems) {
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Descripton: " + menuItem.getDescription());
            System.out.println("Price: €" + menuItem.getPrice() + "\n");
        }

        double totalCost = 0;
        for (MenuItem menuItem : menuItems) {
        totalCost += menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);

    }
}
