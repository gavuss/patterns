package creational.builderFull;

public class Bank {

    public static void main(String[] args) {
        Director director = new Director();

//        director.setCardBuilder(new VisaGoldBuilder());
        director.setCardBuilder(new MasterCardBuilder());
        Card card = director.buildCard();

        System.out.println(card);
    }
}
