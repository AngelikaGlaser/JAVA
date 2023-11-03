package WEEK_6;

import java.util.Random;

public class NightSky {
    private final double density;
    private final int width;
    private final int height;
    private int starsInLastPrint;
    private final Random random;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.random = new Random();
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }

    public static void main(String[] args) {
        NightSky nightSky1 = new NightSky(0.1, 40, 10);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInLastPrint());
        System.out.println();

        NightSky nightSky2 = new NightSky(0.2, 15, 6);
        nightSky2.print();
        System.out.println("Number of stars: " + nightSky2.starsInLastPrint());
    }
}
