package WEEK_5;

public class Counter {
    private int value;
    private final boolean check;

    public Counter(int stringValue, boolean check) {
        this.value = stringValue;
        this.check = check;
    }

    public Counter(int stringValue) {
        this(stringValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public  void increase(){
        this.value++;
    }

    public void decrease(){
        if (!check || value > 0){
            this.value--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (!check) {
                this.value -= decreaseAmount;
            } else {
                this.value = Math.max(0, this.value - decreaseAmount);
            }
        }
    }
}
