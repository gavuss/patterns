package creational.abstratcFactory.team;

import creational.abstratcFactory.worker.analyst.IAnalyst;
import creational.abstratcFactory.worker.developer.IDeveloper;
import creational.abstratcFactory.worker.tester.ITester;

public interface ITeamFactory {

    IAnalyst getAnalyst();

    IDeveloper getDeveloper();

    ITester getTester();
}
