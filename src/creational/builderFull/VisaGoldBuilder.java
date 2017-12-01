package creational.builderFull;

import static creational.builderFull.Type.VISA_GOLD;

public class VisaGoldBuilder extends CardBuilder {

    @Override
    public void withType() {
        card.setType(VISA_GOLD);
    }

    @Override
    public void withNumber() {
        card.setNumber(8888777766664444L);
    }

    @Override
    public void withBalance() {
        card.setBalance(1000000.00);
    }
}
