package creational.abstratcFactory.worker.developer;

public class Pavel implements IDeveloper {

    @Override
    public void writeCode(String bankName) {
        System.out.println("Pavel пишет код для банка " + bankName);
    }
}
