package creational.builderSimple;

public class Bank {

    public static void main(String[] args) {
        final Client client = new ClientBuilder()
                .withName("Anton")
                .withSurname("Solynkin")
                .withAddress("Moscow")
                .build();

        System.out.println(client);
    }
}
