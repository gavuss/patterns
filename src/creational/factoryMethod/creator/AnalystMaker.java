package creational.factoryMethod.creator;

import creational.factoryMethod.worker.Analyst;
import creational.factoryMethod.worker.IWorker;

public class AnalystMaker implements IWorkerMaker {

    @Override
    public IWorker createWorker() {
        return new Analyst();
    }
}
