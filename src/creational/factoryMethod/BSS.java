package creational.factoryMethod;

import creational.factoryMethod.creator.AnalystCreator;
import creational.factoryMethod.creator.DeveloperCreator;
import creational.factoryMethod.creator.IWorkerMaker;
import creational.factoryMethod.creator.TesterCreator;
import creational.factoryMethod.worker.IWorker;

public class BSS {

    public static void main(String[] args) throws IllegalAccessException {
        //Изменения происходит только в этой строчке, меняется @param specialty
        IWorkerMaker workerFactory = createWorkerBySpeciality("IAnalyst");
        IWorker worker = workerFactory.createWorker();

        worker.doSomething();
    }

    public static IWorkerMaker createWorkerBySpeciality(String specialty) throws IllegalAccessException {
        switch (specialty) {
            case "IAnalyst":
                return new AnalystCreator();
            case "IDeveloper":
                return new DeveloperCreator();
            case "ITester":
                return new TesterCreator();
            default:
                throw new IllegalAccessException(specialty + " is unknown type!");
        }
    }
}

