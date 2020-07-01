package burger_shop;

public class DeluxeBurger extends Hamburger {
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", "Potato", 9.99);
        super.addHamburgerAddition1(Side.chips(), Side.chipsPrice());
        super.addHamburgerAddition2(Side.fanta(), Side.fantaPrice());
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public void addHamburgerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHamburgerAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    public double totalBurgerPrice() {
        double hamburgerPrice = super.totalBurgerPrice();
        if (addition1Name != null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added: " + this.addition1Name + " for an extra $" + this.addition1Price);
        }
        if (addition2Name != null && addition2Name != addition1Name) {
            hamburgerPrice += addition2Price;
            System.out.println("Added: " + this.addition2Name + " for an extra $" + this.addition2Price);
        }
        if (addition3Name != null && addition3Name != addition1Name && addition3Name != addition2Name) {
            hamburgerPrice += addition3Price;
            System.out.println("Added: " + this.addition3Name + " for an extra $" + this.addition3Price);
        }
        if (addition4Name != null && addition4Name != addition1Name && addition4Name != addition2Name
                && addition4Name != addition3Name) {
            hamburgerPrice += addition4Price;
            System.out.println("Added: " + this.addition4Name + " for an extra $" + this.addition4Price);
        }
        if (addition5Name != null && addition5Name != addition1Name && addition5Name != addition2Name
                && addition5Name != addition3Name && addition5Name != addition4Name) {
            hamburgerPrice += addition5Price;
            System.out.println("Added: " + this.addition5Name + " for an extra $" + this.addition4Price);
        }
        if (addition6Name != null && addition6Name != addition1Name && addition6Name != addition2Name
                && addition6Name != addition3Name && addition6Name != addition4Name && addition6Name != addition5Name) {
            hamburgerPrice += addition6Price;
            System.out.println("Added: " + this.addition6Name + " for an extra $" + this.addition6Price);
        }
        return hamburgerPrice;

    }
}
