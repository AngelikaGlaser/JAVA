package WEEK_7.Ex_4;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() +totalWeight() <= maxWeight){
            suitcases.add(suitcase);
        }
    }

    public void printThings(){
        for (Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }

    public int totalWeight(){
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() +" kg)";
    }
}
