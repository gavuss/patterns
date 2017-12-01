package creational.factoryMethod.worker;

public class Developer implements IWorker {

    @Override
    public void doSomething() {
        System.out.println("Пишет код доработки...");
    }
}
