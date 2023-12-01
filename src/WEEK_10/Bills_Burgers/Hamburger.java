package WEEK_10.Bills_Burgers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private final String name;
    private final String meat;
    private final BigDecimal price;
    private final String breadRollType;

    // Use List to store addition details
    private final List<Addition> additions = new ArrayList<>();

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = BigDecimal.valueOf(price);
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition(String additionName, double additionPrice) {
        additions.add(new Addition(additionName, BigDecimal.valueOf(additionPrice)));
    }

    public BigDecimal itemizeHamburger() {
        BigDecimal totalPrice = this.price;
        System.out.println(name + " hamburger on " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price + "€");

        // Iterate over the additions using List
        for (Addition addition : additions) {
            System.out.println("Added " + addition.getName() + " for an extra " + addition.getPrice() + "€");
            totalPrice = totalPrice.add(addition.getPrice());
        }

        return totalPrice;
    }
}

class Addition {
    private final String name;
    private final BigDecimal price;

    public Addition(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

