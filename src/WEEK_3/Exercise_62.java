package WEEK_3;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_62 {
    public static void main(String[] args){
        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

// sorting brothers
        Collections.sort(brothers);

// removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }
    public static void removeLast(ArrayList<String> list){
        int lastIndex = list.size() -1;
        list.remove(lastIndex);
    }
}
