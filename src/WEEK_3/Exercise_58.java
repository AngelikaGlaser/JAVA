package WEEK_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_58 {
    static Scanner reader = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            } else {
                words.add(word);
            }
        }
    }
}
