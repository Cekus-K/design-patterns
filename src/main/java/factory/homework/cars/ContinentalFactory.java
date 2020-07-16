package factory.homework.cars;

import factory.homework.cars.car.*;

class ContinentalFactory extends Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(1997, 2010, FuelType.DIESEL, position);
            case E60:
                return new BMW(2975, 2013, FuelType.GAS, position);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }

    @Override
    public Car buildAudi(AudiModel model) {
        switch (model) {
            case Q8:
                return new Audi(2988, 2015, FuelType.DIESEL, position);
            case RS6:
                return new Audi(4196, 2017, FuelType.GAS, position);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }
}
