package creational.builderFull;

public abstract class CardBuilder {

    Card card;

    void createCard() {
        card = new Card();
    }

    public abstract void withType();

    public abstract void withNumber();

    public abstract void withBalance();

    public Card getCard() {
        return card;
    }
}
