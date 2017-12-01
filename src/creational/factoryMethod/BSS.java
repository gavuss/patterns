package creational.factoryMethod;

import creational.factoryMethod.creator.AnalystMaker;
import creational.factoryMethod.creator.DeveloperMaker;
import creational.factoryMethod.creator.IWorkerMaker;
import creational.factoryMethod.creator.TesterMaker;
import creational.factoryMethod.worker.IWorker;

public class BSS {

    public static void main(String[] args) throws IllegalAccessException {
        //Изменения происходит только в этой строчке, меняется @param specialty
        IWorkerMaker workerFactory = createWorkerBySpeciality("IDeveloper");
        IWorker worker = workerFactory.createWorker();

        worker.doSomething();
    }

    public static IWorkerMaker createWorkerBySpeciality(String specialty) throws IllegalAccessException {
        switch (specialty) {
            case "IAnalyst":
                return new AnalystMaker();
            case "IDeveloper":
                return new DeveloperMaker();
            case "ITester":
                return new TesterMaker();
            default:
                throw new IllegalAccessException(specialty + " is unknown type!");
        }
    }
}

