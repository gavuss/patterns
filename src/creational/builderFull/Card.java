package creational.builderFull;

public class Card {

    private Type type;
    private long number;
    private double balance;

    public void setType(Type type) {
        this.type = type;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
