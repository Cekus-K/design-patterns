package factory.lesson.factorymethod;

import factory.lesson.factorymethod.units.Unit;
import factory.lesson.factorymethod.units.UnitType;

public abstract class Factory {

    public abstract Unit createUnit(UnitType type);
}
