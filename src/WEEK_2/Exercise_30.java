package WEEK_2;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("\nExercise 30:\n");

        int beginning = 1;
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        while (beginning <= limit) {
            System.out.println(beginning);
            beginning++;
        }
    }
}
