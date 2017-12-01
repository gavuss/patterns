package creational.abstratcFactory.worker.developer;

public class Valentin implements IDeveloper {

    @Override
    public void writeCode(String bankName) {
        System.out.println("Valentin пишет код для банка " + bankName);
    }
}