package bevavioral.strategy.weapon;

import bevavioral.strategy.IAttack;

public class Axe implements IAttack {

    @Override
    public void attack() {
        System.out.println("Нанести рубящий удар топором");
    }
}