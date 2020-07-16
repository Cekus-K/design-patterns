package factory.lesson.factorymethod;

import factory.lesson.factorymethod.units.Rifleman;
import factory.lesson.factorymethod.units.Tank;
import factory.lesson.factorymethod.units.Unit;
import factory.lesson.factorymethod.units.UnitType;

public class UnitFactory extends Factory {

    @Override
    public Unit createUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
