package creational.builderSimple;

public class ClientBuilder {

    private String name;
    private String surname;
    private String email = "нет email";
    private String address;

    public ClientBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public ClientBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public ClientBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Client build() {
        return new Client(this);
    }
}
