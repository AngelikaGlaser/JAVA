package WEEK_10.Bills_Burgers;

public class DeluxeBurger extends Hamburger {
    // Constants for deluxe burger details
    private static final String DELUXE_NAME = "Deluxe Burger";
    private static final String DELUXE_MEAT = "Sausage & Bacon";
    private static final double DELUXE_BASE_PRICE = 14.54;
    private static final String DELUXE_BREAD_ROLL_TYPE = "White";

    // Constants for additional items in Deluxe Burger
    private static final String CHIPS_NAME = "Chips";
    private static final double CHIPS_PRICE = 2.75;

    private static final String DRINK_NAME = "Drink";
    private static final double DRINK_PRICE = 1.81;

    // Constructor for DeluxeBurger
    public DeluxeBurger() {
        super(DELUXE_NAME, DELUXE_MEAT, DELUXE_BASE_PRICE, DELUXE_BREAD_ROLL_TYPE);
        addChips();
        addDrink();
    }

    // Override methods to indicate that no additional items can be added to a deluxe burger
    @Override
    public void addHamburgerAddition(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    // Additional methods for adding chips and drink
    private void addChips() {
        super.addHamburgerAddition(CHIPS_NAME, CHIPS_PRICE);
    }

    private void addDrink() {
        super.addHamburgerAddition(DRINK_NAME, DRINK_PRICE);
    }
}
