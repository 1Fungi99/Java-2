package burger_shop;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //Constructors for all types of toppings
    // ===============================================================
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    // ===============================================================

    public double totalBurgerPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + breadRollType + " roll with a " + meat + " patty. Price: $"
                + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added: " + this.addition1Name + " for an extra $" + this.addition1Price);
        }
        if (this.addition2Name != null && this.addition2Name != this.addition1Name) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added: " + this.addition2Name + " for an extra $" + this.addition2Price);
        }
        return hamburgerPrice;
    }

}