package structural.adapter.inheritance;

public class Company {

    public static void main(String[] args) {
        IJavaDeveloper developer = new AdapterPerlToJava();

        developer.writeCode();
        developer.verifyCode();
    }
}
