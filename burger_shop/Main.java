package burger_shop;

// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Order order = new Order(new Hamburger("joey's", Meat.bison(), Bread.potato(), 5.99), Bread.potato(),
                Meat.bison());
        order.addSides(Side.fanta(), Side.fries());
        order.purchaseOrder();

        // Meal meal = new Meal();
        // meal.setDrink(Side.fanta(), Side.fantaPrice());
        // meal.setFries(Side.vooDooFries(), Side.vooDooFriesPrice());
        // meal.setBurger(new DeluxeBurger());
        // meal.totalMealPrice();

        // Hamburger joey = new Hamburger("Joey's", Meat.beef(), Bread.rye(), 6.99);

        // System.out.println("Total is $" + joey.totalBurgerPrice());

        // HealthBurger heath = new HealthBurger(7.99);
        // heath.addHealthAddition1("onion", .50);
        // heath.addHealthAddition2("lettuce", .50);
        // heath.addHealthAddition3("tomato", .50);
        // heath.addHealthAddition4("onion", .50);
        // System.out.println("Total is $" + heath.totalBurgerPrice());

        // newOrder();
    }

    // public static void newOrder() {
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Start new order?");
    //     System.out.println("1. Yes");
    //     System.out.println("2. No");
    //     int orderInt = s.nextInt();
    //     switch (orderInt) {
    //         case 1:
    //             System.out.println("Order Menu.");
    //             boolean orderBool = true;
    //             orderMenu(orderBool, s);
    //             break;
    //         case 2:
    //             System.out.println("Thank you for choosing Bill's Burgers... Goodbye");
    //             break;
    //     }
    // }

    // public static boolean orderMenu(boolean orderBool, Scanner s) {
    //     while (orderBool) {
    //         String selection = "";
    //         System.out.println("Choose Burger Style:");
    //         System.out.println("1. Hamburger: $6.99");
    //         System.out.println("2. Deluxe Burger: $7.99");
    //         System.out.println("3. \"Healthy\" Burger: $6.99");
    //         switch (s.nextInt()) {
    //             case 1:
    //                 selection = "Hamburger";
    //                 break;
    //             case 2:
    //                 selection = "Deluxe Hamburger";
    //                 break;
    //             case 3:
    //                 selection = "\"Healthy\" Burger";
    //                 break;
    //         }

    //     }
    //     return false;

    // }
}
