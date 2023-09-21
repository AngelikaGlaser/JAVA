package WEEK_2;
import java.util.Scanner;
public class Exercise_41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Generate a random number between 0 and 100
        int drawNumber = (int) (Math.random() * 101);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between 0 and 100.");
        System.out.println("Can you guess what it is?");

        int numOfGuesses = 0;

        while (true){
            System.out.print("Guess a number: ");
            int userGuess = Integer.parseInt(reader.nextLine());
            numOfGuesses++;

            if (userGuess < drawNumber){
                System.out.println("The number is greater than " + userGuess + ". Number of guesses: "+ numOfGuesses + "\n");
            } else if (userGuess > drawNumber){
                System.out.println("The number is lesser than " + userGuess + ". Number of guesses: "+ numOfGuesses + "\n");
            } else {
                System.out.println("Congratulations, your guess is correct!" + ". Total number of guesses: "+ numOfGuesses);
                break;
            }
        }
    }
}
