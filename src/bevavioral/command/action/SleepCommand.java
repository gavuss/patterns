package bevavioral.command.action;

import bevavioral.command.ICommand;
import bevavioral.command.Soldier;

/**
 * Created by Alexander Silaev on 06.12.2017.
 */
public class SleepCommand extends Command implements ICommand {

    public SleepCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.sleep();
    }
}
