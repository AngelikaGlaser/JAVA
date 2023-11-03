package WEEK_5;

import static java.lang.Math.abs;

public class Apartment {
    private final int rooms;
    private final int squareMeters;
    private final int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger (Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        return abs(this.calculatePrice() - otherApartment.calculatePrice());
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.calculatePrice() > otherApartment.calculatePrice();
    }

    private int calculatePrice() {
        return this.squareMeters * this.pricePerSquareMeter;
    }
}
