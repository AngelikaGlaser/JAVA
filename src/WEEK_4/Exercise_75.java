package WEEK_4;

public class Exercise_75 {
    public static void main(String[] args){
        DecreasingCounter counter = new DecreasingCounter(200);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
