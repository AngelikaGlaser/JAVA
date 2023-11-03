package WEEK_5;

public class Exercise_84 {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5, true);
        Counter counter2 = new Counter(10);
        Counter counter3 = new Counter(true);
        Counter counter4 = new Counter();

        System.out.println("Counter 1 value: " + counter1.value());
        System.out.println("Counter 2 value: " + counter2.value());
        System.out.println("Counter 3 value: " + counter3.value());
        System.out.println("Counter 4 value: " + counter4.value());

        counter1.increase();
        counter2.decrease();
        counter3.increase();
        counter4.decrease();

        System.out.println("Counter 1 after increase: " + counter1.value());
        System.out.println("Counter 2 after decrease: " + counter2.value());
        System.out.println("Counter 3 after increase: " + counter3.value());
        System.out.println("Counter 4 after decrease: " + counter4.value());

        counter1.increase(3);
        counter2.decrease(2);

        System.out.println("Counter 1 after increase(3): " + counter1.value());
        System.out.println("Counter 2 after decrease(2): " + counter2.value());
    }
}