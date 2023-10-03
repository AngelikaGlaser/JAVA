package WEEK_4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "This card has " + this.balance + " euros." ;
    }
    public void payEconomical() {
        if (balance >= 2.50) {
            balance = balance - 2.50;
        }
    }

    public void payGourmet() {
        if (balance >= 4.00) {
            balance = balance - 4.00;
        }
    }
    public void loadMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
