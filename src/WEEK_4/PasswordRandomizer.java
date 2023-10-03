package WEEK_4;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    private final Random random;
    private final int passLength;
    private static final String characters = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.passLength = length;
        this.random = new Random();

    }

    public String createPassword() {
        StringBuilder passW = new StringBuilder();
        // Write the code here which returns the new password
        while (passW.length() < this.passLength) {
            int number = this.random.nextInt(characters.length());
            char symbol = characters.charAt(number);
                passW.append(symbol);
        }
        return passW.toString();
    }
}
