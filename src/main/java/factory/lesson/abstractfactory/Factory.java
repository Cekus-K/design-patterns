package factory.lesson.abstractfactory;

import factory.lesson.abstractfactory.units.AirUnit;
import factory.lesson.abstractfactory.units.InfantryUnit;
import factory.lesson.abstractfactory.units.MechanizedUnit;
import factory.lesson.abstractfactory.units.UnitType;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);
    public abstract AirUnit createAirUnit(UnitType type);

}
