package bevavioral.command.action;

import bevavioral.command.ICommand;
import bevavioral.command.Soldier;

//ConcreteCommand
public class WrungOutCommand extends Command implements ICommand {

    public WrungOutCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.wrungOut();
    }
}
