package factory.lesson.abstractfactory.units;

public abstract class InfantryUnit {

    private int hp;
    private int exp;
    private int dmg;

    protected InfantryUnit(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    int getHp() {
        return hp;
    }

    int getExp() {
        return exp;
    }

    int getDmg() {
        return dmg;
    }
}
