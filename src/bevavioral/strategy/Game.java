package bevavioral.strategy;

import bevavioral.strategy.weapon.Axe;
import bevavioral.strategy.weapon.Spear;
import bevavioral.strategy.weapon.Sword;

public class Game {

    public static void main(String[] args) {
        Warrior personage = new Warrior();

        personage.setAttack(new Sword());
        personage.makeAttack();

        personage.setAttack(new Axe());
        personage.makeAttack();

        personage.setAttack(new Spear());
        personage.makeAttack();
    }
}
