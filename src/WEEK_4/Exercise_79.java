package WEEK_4;
import java.util.Scanner;

public class Exercise_79 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        int userNum;
        System.out.println("Type numbers:");
        while (true) {
            userNum = Integer.parseInt(reader.nextLine());
            if (userNum != -1) {
                if (userNum % 2 == 0 ){
                    even.addNumber(userNum);
                    stats.addNumber(userNum);
                }else {
                    odds.addNumber(userNum);
                    stats.addNumber(userNum);
                }
            } else {
                break;
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of evens: " + even.sum());
        System.out.println("sum of odds: " + odds.sum());
    }
}
