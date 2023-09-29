package WEEK_3;

import java.util.Scanner;

public class Exercise_56 {
    static Scanner reader = new Scanner (System.in);
    public static void main(String[] args){
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    static String reverse(String text){
        int textLength = text.length() -1;
        String reverseWord = "";

        while ((textLength) >= 0){
            reverseWord = reverseWord + text.charAt(textLength);
            textLength -= 1;
        }
        return reverseWord;
    }
}
