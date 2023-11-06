package WEEK_7.Ex_4;

//lots of theory in this week.... good to read again later.
public class exercise_4     {
    public static void main(String[] Container) {
        WEEK_7.Ex_4.Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int weight = 1;
        for (int i=0; i <= 100; i++){
            Thing brick = new Thing("Brick", weight);
            Suitcase suitcase = new Suitcase(weight);

            suitcase.addThing(brick);
            container.addSuitcase(suitcase);

            weight++;
            }
        }
    }