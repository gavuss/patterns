package bevavioral.command;

import bevavioral.command.action.GetUpCommand;
import bevavioral.command.action.LieDownCommand;
import bevavioral.command.action.SleepCommand;
import bevavioral.command.action.WrungOutCommand;

public class Army {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        Sergeant sergeant = new Sergeant(
                new LieDownCommand(soldier),
                new WrungOutCommand(soldier),
                new GetUpCommand(soldier),
                new SleepCommand(soldier));

        System.out.println("Sergeant gives command!");
        System.out.println();
        System.out.println("Solder do:");
        sergeant.lieDown();
        sergeant.wrungOut();
        sergeant.getUp();
        sergeant.getSleep();
    }
}
