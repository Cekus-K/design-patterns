package factory.lesson.abstractfactory;

import factory.lesson.abstractfactory.Factory;
import factory.lesson.abstractfactory.units.*;

public class RedFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Helicopter(40, 0, 30);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }    }
}
