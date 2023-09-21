package WEEK_3;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_61 {
    static Scanner reader = new Scanner (System.in);
    public static void main(String[] args){
        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");

        int itemCount = countItems(itemList);
        System.out.println("Number of items in the list: " + itemCount);

        System.out.println("Would you like to add to the list? ");
        String userAnswer = reader.nextLine();
        if (userAnswer.equalsIgnoreCase("yes")){
            System.out.println("What would you like to add to the list? ");
            String newItem = reader.nextLine();
            addToList(itemList, newItem);
        }

        itemCount = countItems(itemList);
        System.out.println("Number of items in the list: " + itemCount);
    }
    public static void addToList(ArrayList<String> list, String item) {

        list.add(item);
    }
    public static int countItems(ArrayList<String> list){
        return list.size();
    }
}
