package WEEK_8.Ex_11;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private final double maxWeight;
    private final ArrayList<ToBeStored> contents;

    public Box(double maxWeight){
        this.contents = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored item) {
        if (item.weight() + weight() <= maxWeight) {
            contents.add(item);
        }
    }

    @Override
    public double weight(){
        double weight = 0;
        for(ToBeStored item : contents){
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + contents.size() + " things, total weight " + weight() + " kg";
    }
}
