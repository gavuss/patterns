package creational.factoryMethod.creator;

import creational.factoryMethod.worker.IWorker;
import creational.factoryMethod.worker.Tester;

public class TesterMaker implements IWorkerMaker {

    @Override
    public IWorker createWorker() {
        return new Tester();
    }
}
