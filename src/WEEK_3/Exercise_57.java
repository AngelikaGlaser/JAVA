package WEEK_3;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_57 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> userWords = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                System.out.println("You types the following words: ");
                for (String list : userWords) {
                    System.out.println(list);
                }
                break;
            } else {
                userWords.add(word);
            }
        }
    }
}
