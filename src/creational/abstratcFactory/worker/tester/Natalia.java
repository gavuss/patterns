package creational.abstratcFactory.worker.tester;

public class Natalia implements ITester {

    @Override
    public void testCode(String bankName) {
        System.out.println("Natalia тестирует доработку для банка " + bankName);
    }
}