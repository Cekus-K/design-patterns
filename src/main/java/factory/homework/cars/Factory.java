package factory.homework.cars;

import factory.homework.cars.car.AudiModel;
import factory.homework.cars.car.BMWModel;
import factory.homework.cars.car.Car;

public abstract class Factory {

    public abstract Car buildBMW(BMWModel model);
    public abstract Car buildAudi(AudiModel model);
}
