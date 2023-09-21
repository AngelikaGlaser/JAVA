package WEEK_2;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("\nExercise 36:\n");
    System.out.println("Type numbers: ");
    int sumOfNum = 0;
    int numAmount = 0;
    double avgOfNum = 0;
    int sumOfEvenNum = 0;
    int sumOfOddNum = 0;
    while (true) {
        int readNum = Integer.parseInt(reader.nextLine());

        if (readNum == -1) {
            System.out.println("Thank you and see you later!");
            break;
        } else {
            sumOfNum += readNum;
            numAmount++;
            avgOfNum = ((double)sumOfNum / numAmount);
            if (readNum % 2 == 0){
                sumOfEvenNum++;
            } else {
                sumOfOddNum++;
            }
        }
    }
    System.out.println("The sum is " + sumOfNum);
    System.out.println("How many numbers: " + numAmount);
    System.out.println("Average: " + avgOfNum);
    System.out.println("Even numbers: " + sumOfEvenNum);
    System.out.println("Odd numbers: " + sumOfOddNum);
    }
}