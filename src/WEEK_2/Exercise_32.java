package WEEK_2;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("\nExercise 32:\n");
    System.out.print("Until what? ");
    int untilNum = Integer.parseInt(reader.nextLine());
    int sumOfSet = 0;
    int helper = 1;

    while (helper <= untilNum) {
        sumOfSet += helper;
        helper++;
    }
    System.out.println("Sum is " + sumOfSet);
    }
}