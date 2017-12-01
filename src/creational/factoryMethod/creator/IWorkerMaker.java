package creational.factoryMethod.creator;

import creational.factoryMethod.worker.IWorker;

public interface IWorkerMaker {

    IWorker createWorker();
}
