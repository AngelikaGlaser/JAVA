package WEEK_6;
import java.util.Arrays;
public class Exercise_98 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(reverse));
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

}
