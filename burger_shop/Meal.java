package burger_shop;

import java.text.DecimalFormat;

public class Meal {
    private Hamburger burger;
    private String drink;
    private double drinkPrice;
    private String fries;
    private double friesPrice;

    private String extraSide;
    private double extraSidePrice;

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public Meal() {
        this.burger = new Hamburger("Meal: ", Meat.beef(), Bread.potato(), 5.99);
        this.drink = Side.drPepper();
        this.drinkPrice = Side.drPepperPrice();
        this.fries = Side.fries();
        this.friesPrice = Side.friesPrice();
    }

    public void setDrink(String drink, double drinkPrice) {
        this.drink = drink;
        this.drinkPrice = drinkPrice;
    }

    public void setFries(String fries, double friesPrice) {
        this.fries = fries;
        this.friesPrice = friesPrice;
    }

    public void setExtraSide(String extraSide, double extraSidePrice) {
        this.extraSide = extraSide;
        this.extraSidePrice = extraSidePrice;
    }

    public void setBurger(Hamburger burger) {
        this.burger = burger;
    }

    public void totalMealPrice() {
        double mealPrice = burger.totalBurgerPrice();

        System.out.println("    Side: " + drink + ". Price: " + drinkPrice);
        System.out.println("    Side: " + fries + ". Price: " + friesPrice);
        if (extraSide != null || extraSidePrice != 0) {
            System.out.println("    Side: " + extraSide + ". Price: " + extraSidePrice);
            mealPrice += drinkPrice + friesPrice + extraSidePrice;
        } else {
            mealPrice += drinkPrice + friesPrice;
        }
        System.out.println("Total: $" + df2.format(mealPrice));

    }
}

/*
NOTE: for the requirements below:
- Prevent the Meal Class from allowing multiples of the SAME item from being added to it.
- Prevent the Meal Class from allowing multiple Burgers
- Prevent the Meal Class from allowing multiple Drinks
- Limit the Meal Class to a maximum of 3 sides

The meal class is mainly setters, there is no way of adding multiple of anything
*/
