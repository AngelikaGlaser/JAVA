package WEEK_4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private final int valueRemember; // object variable that remembers the initial value of the counter.
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueRemember = value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            this.value -= 1;
        }
    }

    public void reset(){
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.valueRemember;
    }
}
