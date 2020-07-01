package burger_shop;

public class HealthBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyExtra3Name;
    private double healthyExtra3Price;

    private String healthyExtra4Name;
    private double healthyExtra4Price;

    public HealthBurger(double price) {
        super("Healthy", "Beyond Meat", "Brown rye", 5.99);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public void addHealthAddition3(String name, double price) {
        this.healthyExtra3Name = name;
        this.healthyExtra3Price = price;
    }

    public void addHealthAddition4(String name, double price) {
        this.healthyExtra4Name = name;
        this.healthyExtra4Price = price;
    }

    public double totalBurgerPrice() {
        double hamburgerPrice = super.totalBurgerPrice();
        if (healthyExtra1Name != null) {
            if (healthyExtra1Name.toLowerCase().trim() == "lettuce"
                    || healthyExtra1Name.toLowerCase().trim() == "tomato"
                    || healthyExtra1Name.toLowerCase().trim() == "onion") {
                hamburgerPrice += healthyExtra1Price;
                System.out.println("Added: " + this.healthyExtra1Name + " for an extra $" + this.healthyExtra1Price);
            } else {
                System.out.println("Cannot add " + healthyExtra1Name + ".");
            }
        }
        if (healthyExtra2Name != null && healthyExtra2Name != healthyExtra1Name) {
            if (healthyExtra2Name.toLowerCase().trim() == "lettuce"
                    || healthyExtra2Name.toLowerCase().trim() == "tomato"
                    || healthyExtra2Name.toLowerCase().trim() == "onion") {
                hamburgerPrice += healthyExtra2Price;
                System.out.println("Added: " + this.healthyExtra2Name + " for an extra $" + this.healthyExtra2Price);
            } else {
                System.out.println("Cannot add " + healthyExtra2Name + ".");
            }
        }
        if (healthyExtra3Name != null && healthyExtra3Name != healthyExtra1Name
                && healthyExtra3Name != healthyExtra2Name) {
            if (healthyExtra3Name.toLowerCase().trim() == "lettuce"
                    || healthyExtra3Name.toLowerCase().trim() == "tomato"
                    || healthyExtra3Name.toLowerCase().trim() == "onion") {
                hamburgerPrice += healthyExtra3Price;
                System.out.println("Added: " + this.healthyExtra3Name + " for an extra $" + this.healthyExtra3Price);
            } else {
                System.out.println("Cannot add " + healthyExtra3Name + ".");
            }
        }
        if (healthyExtra4Name != null && healthyExtra4Name != healthyExtra1Name
                && healthyExtra4Name != healthyExtra2Name && healthyExtra4Name != healthyExtra3Name) {
            if (healthyExtra4Name.toLowerCase().trim() == "lettuce"
                    || healthyExtra4Name.toLowerCase().trim() == "tomato"
                    || healthyExtra4Name.toLowerCase().trim() == "onion") {
                hamburgerPrice += healthyExtra4Price;
                System.out.println("Added: " + this.healthyExtra4Name + " for an extra $" + this.healthyExtra4Price);
            } else {
                System.out.println("Cannot add " + healthyExtra4Name + ".");
            }
        }
        return hamburgerPrice;
    }

}
