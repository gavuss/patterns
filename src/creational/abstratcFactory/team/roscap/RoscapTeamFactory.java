package creational.abstratcFactory.team.roscap;

import creational.abstratcFactory.worker.analyst.IAnalyst;
import creational.abstratcFactory.worker.developer.IDeveloper;
import creational.abstratcFactory.team.ITeamFactory;
import creational.abstratcFactory.worker.tester.ITester;
import creational.abstratcFactory.worker.analyst.Anna;
import creational.abstratcFactory.worker.developer.Pavel;
import creational.abstratcFactory.worker.tester.Natalia;

public class RoscapTeamFactory implements ITeamFactory {

    @Override
    public IAnalyst getAnalyst() {
        return new Anna();
    }

    @Override
    public IDeveloper getDeveloper() {
        return new Pavel();
    }

    @Override
    public ITester getTester() {
        return new Natalia();
    }
}
