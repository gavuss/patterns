package bevavioral.command.action;

import bevavioral.command.ICommand;
import bevavioral.command.Soldier;

//ConcreteCommand
public class LieDownCommand extends Command implements ICommand {

    public LieDownCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.lieDown();
    }
}
