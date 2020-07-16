package factory.homework.cars;

import factory.homework.cars.car.AudiModel;
import factory.homework.cars.car.BMWModel;
import factory.homework.cars.car.Car;

class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getPosition());

        Car audi = continentalFactory.buildAudi(AudiModel.RS6);
        System.out.println(audi.getPosition());
    }
}
