package burger_shop;

import java.util.*;

public class Order {
    private Hamburger burger;
    private String bread;
    private String meat;
    private Meal meal;
    private Side drink;
    private static List<Topping> topping;

    public Order(Hamburger burger, String bread, String meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    public static void addToppings(Topping... ts) {
        for (Topping t : ts) {
            topping.add(t);
            System.out.println("Topping: " + t + " added. Price: $0.15");
        }
    }

    public void addSides(String... ss) {
        List<String> side = new ArrayList<>();
        for (String s : ss) {
            System.out.println("String: " + s + " added.");
            side.add(s);
        }
    }

    public void addDrink(Side drink) {
        this.drink = drink;
    }

    public void purchaseOrder() {
        System.out.println(burger.totalBurgerPrice());
    }
}
