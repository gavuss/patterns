package bevavioral.strategy.weapon;

import bevavioral.strategy.IAttack;

public class Sword implements IAttack {

    @Override
    public void attack() {
        System.out.println("Нанести режущий удар мечом");
    }
}
