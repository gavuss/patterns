package creational.factoryMethod.creator;

import creational.factoryMethod.worker.IWorker;
import creational.factoryMethod.worker.Tester;

public class TesterCreator implements IWorkerMaker {

    @Override
    public IWorker createWorker() {
        return new Tester();
    }
}
