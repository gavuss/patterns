package structural.adapter.composition;


public class Company {

    public static void main(String[] args) {
        IJavaDeveloper developer = new AdapterPerlToJava();

        developer.writeCode();
        developer.verifyCode();
    }
}
