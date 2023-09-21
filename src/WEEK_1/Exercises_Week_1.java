package WEEK_1;

import java.util.Scanner;
public class Exercises_Week_1 {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        //ex1
        System.out.println("\nExercise 1: \nAngelika Glaser");

        //ex5
        int daysInYear = 365;
        int seconds = daysInYear * 24 * 60 * 60;
        System.out.println("\nExercise 2: \nThere are " + seconds + " seconds in a year.");

        //ex9
        System.out.println("\nExercise 9:");
        //ask for the first number
        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        //ask for the second number
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        //give the result, where answer is in decimal
        System.out.println( first + " / " + second + " = " + ((double)first / second));

        //ex10
        //ask for the radius
        System.out.print("\nExercise 10: \nType the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        //Calculate the circumference
        System.out.println("Circumference of the circle: " + 2 * radius * Math.PI);

        //ex14
        System.out.print("\nExercise 14: \nType a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("Your number is positive!");
        } else if (number < 0) {
            System.out.println("Your number is negative!");
        } else {
            System.out.println("Your number is 0!");
        }

        //ex16
        System.out.print("\nExercise 16: \nType a number: ");
        int evenOrOdd = Integer.parseInt(reader.nextLine());

        if ((evenOrOdd % 2) == 1) {
            System.out.println("Number " + evenOrOdd + " is odd.");
        } else {
            System.out.println("Number " + evenOrOdd + " is even.");
        }

        //ex18
        System.out.print("\nExercise 18: \nType in the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());

        if (60 >= grade && grade >= 50 ) {
            System.out.println("Grade: 5");
        } else if (49 >= grade && grade >= 45 ) {
            System.out.println("Grade: 4");
        } else if (44 >= grade && grade >= 40 ) {
            System.out.println("Grade: 3");
        } else if (39 >= grade && grade >= 35 ) {
            System.out.println("Grade: 2");
        } else if (34 >= grade && grade >= 30 ) {
            System.out.println("Grade: 1");
        } else if (29 >= grade && grade >= 0 ) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("Wrong point value. Needs to be between 0 and 60.");
        }

        //ex19
        System.out.print("\nExercise 19: \nHow old are you? ");
        int ageCheck = Integer.parseInt(reader.nextLine());

        if (ageCheck >= 0 && ageCheck <= 120) {
            System.out.println("OK!");
        } else {
            System.out.println("Impossible!");
        }

        //ex21
        System.out.print("\nExercise 21: \nType a year: ");
        int leapYear = Integer.parseInt(reader.nextLine());

        if ((leapYear % 4 == 0) && ((leapYear % 100 != 0) || (leapYear % 400 == 0))){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        //ex22
        String password = "carrot";
        System.out.print("\nExercise 21: ");

        while (true){
            System.out.print("\nType in the password: ");
            String guess = reader.nextLine();
            if (guess.equals(password)) {
                System.out.println("Right!\n\nThe secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong password!");
            }
        }
    }
}
