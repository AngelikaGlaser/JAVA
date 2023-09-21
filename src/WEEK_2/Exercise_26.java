package WEEK_2;
import java.util.Scanner;
public class Exercise_26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercise 26:\n");

        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            } else {
                sum = sum + read;
                System.out.println("Sum now: " + sum);
            }
        }

        System.out.println("Sum in the end: " + sum);
    }
}