package bevavioral.strategy;

public class Warrior {

    IAttack attack;

    public void setAttack(IAttack attack) {
        this.attack = attack;
    }

    public void makeAttack() {
        attack.attack();
    }
}
