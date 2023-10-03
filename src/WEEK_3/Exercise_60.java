package WEEK_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Exercise_60 {
    static Scanner reader = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<String> alphabeticalList = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                Collections.sort(alphabeticalList);
                for (String list : alphabeticalList) {
                    System.out.println(list);
                }
                break;
            } else {
                alphabeticalList.add(word);
            }
        }
    }
}
