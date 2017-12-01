package creational.factoryMethod.worker;

public class Analyst implements IWorker {

    @Override
    public void doSomething() {
        System.out.println("Созадет ТЗ по доработке...");
    }
}
