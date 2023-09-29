package WEEK_3;

import java.util.Scanner;

public class Exercise_50 {
    static Scanner reader = new Scanner (System.in);
    public static void main(String[] args){
        System.out.println("Type your name: ");
        String userName = reader.nextLine();

        if (userName.length() >= 3) {
            int i = 0;
            while (i < 3) {
                System.out.println((i + 1) + ". character: " + userName.charAt(i));
                i++;
            }
        }

    }
}
