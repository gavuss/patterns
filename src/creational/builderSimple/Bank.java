package creational.builderSimple;

public class Bank {

    public static void main(String[] args) {
        final Client client = new ClientBuilder()
                .withName("Aleksander")
                .withSurname("Silaev")
                .withEmail("ololo@olo.olo")
                .withAddress("Moscow")
                .build();

        System.out.println(client);
    }
}
