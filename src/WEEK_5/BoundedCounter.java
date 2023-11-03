package WEEK_5;

public class BoundedCounter {
    private int value;
    private final int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit){
            this.value = 0;
        }
    }
    public int getValue() {
        return this.value;
    }
    public void setValue(int parameter){
        if (parameter >= 0 && parameter <= this.upperLimit){
            this.value = parameter;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
}
