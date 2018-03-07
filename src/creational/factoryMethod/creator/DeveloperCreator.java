package creational.factoryMethod.creator;

import creational.factoryMethod.worker.Developer;
import creational.factoryMethod.worker.IWorker;

public class DeveloperCreator implements IWorkerMaker {

    @Override
    public IWorker createWorker() {
        return new Developer();
    }
}
