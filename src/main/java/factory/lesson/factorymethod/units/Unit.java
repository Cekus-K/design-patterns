package factory.lesson.factorymethod.units;

public abstract class Unit {

    private int hp;
    private int exp;
    private int dmg;

    protected Unit(int hp, int exp, int dmg) {
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
