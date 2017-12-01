package creational.abstratcFactory.team.vbrr;

import creational.abstratcFactory.worker.analyst.IAnalyst;
import creational.abstratcFactory.worker.developer.IDeveloper;
import creational.abstratcFactory.team.ITeamFactory;
import creational.abstratcFactory.worker.tester.ITester;
import creational.abstratcFactory.worker.analyst.Nikita;
import creational.abstratcFactory.worker.developer.Valentin;
import creational.abstratcFactory.worker.tester.Roman;

public class VbrrTeamFactory implements ITeamFactory {

    @Override
    public IAnalyst getAnalyst() {
        return new Nikita();
    }

    @Override
    public IDeveloper getDeveloper() {
        return new Valentin();
    }

    @Override
    public ITester getTester() {
        return new Roman();
    }
}
