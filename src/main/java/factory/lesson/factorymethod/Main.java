package factory.lesson.factorymethod;

import factory.lesson.factorymethod.units.Unit;
import factory.lesson.factorymethod.units.UnitType;

class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
    }
}
