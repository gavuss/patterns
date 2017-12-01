package creational.builderFull;

public class Director {

    CardBuilder cardBuilder;

    void setCardBuilder(CardBuilder cardBuilder) {
        this.cardBuilder = cardBuilder;
    }

    Card buildCard() {
        cardBuilder.createCard();
        cardBuilder.withType();
        cardBuilder.withNumber();
        cardBuilder.withBalance();

         return cardBuilder.getCard();
    }
}
