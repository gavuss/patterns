package creational.builderFull;

import static creational.builderFull.Type.MASTER_CARD;

public class MasterCardBuilder extends CardBuilder {

    @Override
    public void withType() {
        card.setType(MASTER_CARD);
    }

    @Override
    public void withNumber() {
        card.setNumber(2222666655554444L);
    }

    @Override
    public void withBalance() {
        card.setBalance(500.00);
    }
}
