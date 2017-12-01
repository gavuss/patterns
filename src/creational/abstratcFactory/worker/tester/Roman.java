package creational.abstratcFactory.worker.tester;

public class Roman implements ITester {

    @Override
    public void testCode(String bankName) {
        System.out.println("Roman тестирует доработку для банка " + bankName);
    }
}