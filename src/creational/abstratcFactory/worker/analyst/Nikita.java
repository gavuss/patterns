package creational.abstratcFactory.worker.analyst;

public class Nikita implements IAnalyst {

    @Override
    public void createTask(String bankName) {
        System.out.println("Nikita пищет ТЗ для банка " + bankName);
    }
}
