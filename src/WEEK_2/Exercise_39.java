package WEEK_2;

public class Exercise_39 {
    public static void main(String[] args) {
        System.out.println("\nExercise 39:\n");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
        System.out.println();
        printRectangle(17,3);
        System.out.println();
        printTriangle(4);

    }

    public static void printStars(int amount) {
        int starTimes = 1;
        while (starTimes <= amount) {
            System.out.print("*");
            starTimes++;
        }
        System.out.println();
    }
    public static void printSquare(int sideSize){
        int sideY = 1;
        while (sideY <= sideSize){
            int sideX = 1;
            while (sideX <= sideSize){
                System.out.print("*");
                sideX++;
            }
            sideY++;
            System.out.println();
        }
    }
    public static void printRectangle(int width, int height){
        int sideYr = 1;
        while (sideYr <= height){
            int sideXr = 1;
            while (sideXr <= width){
                System.out.print("*");
                sideXr++;
            }
            sideYr++;
            System.out.println();
        }
    }
    public static void printTriangle(int size){
        int triangleRow = 1;
        while (triangleRow <= size){
            int starsInRow = 1;
            while (starsInRow <= triangleRow){
                System.out.print("*");
                starsInRow++;
            }
            triangleRow++;
            System.out.println();

        }
    }
}
