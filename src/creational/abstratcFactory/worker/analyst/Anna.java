package creational.abstratcFactory.worker.analyst;

public class Anna implements IAnalyst {

    @Override
    public void createTask(String bankName) {
        System.out.println("Anna пищет ТЗ для банка " + bankName);
    }
}
