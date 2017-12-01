package bevavioral.strategy.weapon;

import bevavioral.strategy.IAttack;

public class Spear implements IAttack {

    @Override
    public void attack() {
        System.out.println("Нанести колящий удар копьем");
    }
}
