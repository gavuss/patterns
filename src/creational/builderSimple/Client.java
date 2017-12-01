package creational.builderSimple;

public class Client {

    private final String name;
    private final String surname;
    private final String email;
    private final String address;

    Client(final ClientBuilder clientBuilder) {
        this.name = clientBuilder.getName();
        this.surname = clientBuilder.getSurname();
        this.email = clientBuilder.getEmail();
        this.address = clientBuilder.getAddress();
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
