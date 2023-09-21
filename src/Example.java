import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        //https://materiaalit.github.io/2013-oo-programming/part1/week-1/
        //semicolon is a linebreak, new row won't do a thing (just for readability)
        System.out.print("Hello "); System.out.print("world"); System.out.print("!");
        //println prints in a way that next print will be on a new line, \n makes a linebreak before printing.
        System.out.println("\n\nFirst\nSecond\nThird\n");

        //VARIABLES
        //String - text, int - whole nr, double - decimal, boolean - truth value
        String text = "normal text";
        int wholeNr = 22;
        double decimalNr = 12.5;
        boolean isTrue = true;

        System.out.println("VARIABLES:\nUsing string variable: " + text + ". \nUsing int and double: " + wholeNr + ", " + decimalNr + ". \nLastly using boolean: " + isTrue + ".");
        //change variable value
        text = "abnormal text";
        System.out.println("\nChanged String value, didn't need the variable type: " + text + ".\n");

        //CALCULATIONS
        int first = 2;
        int second = 4;
        int sum = first + second;

        System.out.println("Calculations:\n" + sum + "\n" + (first * second) + "\nfirst + second:\n" + (first + second));

        //decimals
        double whenDividedAreInts = 3 / 2;
        double whenDividedAreDecimals = 3.0 / 2;

        System.out.println("Calculations w doubles: " + "\n3 / 2 = " + whenDividedAreInts + ". \n3.0 /2 = " + whenDividedAreDecimals);

        //reading user input - greeting (string)
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine();

        //reading user input - age (integers)
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine()); // this reads the age value as string and then turns it into an int
        System.out.println("Your name is " + name + ", and you are "+ age + " years old, nice to meet you!");

        System.out.println( 99 % 2);
    }
}
