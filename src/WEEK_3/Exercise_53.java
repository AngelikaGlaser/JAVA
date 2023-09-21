package WEEK_3;

import java.util.Scanner;
public class Exercise_53 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userWord = reader.nextLine();
        System.out.println("Length of the first part: ");
        int lengthOfFirstPart = Integer.parseInt(reader.nextLine());

        String result = userWord.substring(0, lengthOfFirstPart);
        System.out.println("Result: " + result);
    }
}
