package WEEK_10.Bills_Burgers;

import java.math.BigDecimal;

public class HealthyBurger extends Hamburger {
    // Additional member variables for healthy additions
    private String healthyExtra1Name;
    private BigDecimal healthyExtra1Price;

    private String healthyExtra2Name;
    private BigDecimal healthyExtra2Price;

    // Constructor for HealthyBurger
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    // Methods for adding healthy additions
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = BigDecimal.valueOf(healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = BigDecimal.valueOf(healthyExtra2Price);
    }

    // Override method to generate an appropriate message for the type of burger and addons
    @Override
    public BigDecimal itemizeHamburger() {
        BigDecimal basePrice = super.itemizeHamburger(); // Call the base class method to get the base price

        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price + "€");
            basePrice = basePrice.add(healthyExtra1Price);
        }

        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price + "€");
            basePrice = basePrice.add(healthyExtra2Price);
        }

        return basePrice;
    }
}
