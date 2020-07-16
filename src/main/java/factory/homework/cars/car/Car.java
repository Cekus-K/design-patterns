package factory.homework.cars.car;

public abstract class Car {

    private int engineCapacity;
    private int yearOfProduction;
    private FuelType type;
    private SteeringWheelPosition position;

    protected Car(int engineCapacity, int yearOfProduction, FuelType type, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
        this.type = type;
        this.position = position;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public FuelType getType() {
        return type;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
