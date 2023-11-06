package WEEK_7.Ex_4;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (things.isEmpty()) {
            return "Empty (" + totalWeight() + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + totalWeight() + " kg)";
        } else {
            return things.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
