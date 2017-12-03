package bevavioral.command.action;

import bevavioral.command.ICommand;
import bevavioral.command.Soldier;

//ConcreteCommand
public class GetUpCommand extends Command implements ICommand {

    public GetUpCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.getUp();
    }
}
