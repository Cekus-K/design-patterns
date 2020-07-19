package templatemethod.lesson;

public abstract class CarStaringSequence {

    public final void startTheCar() {
        fastenSeatBelt();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void fastenSeatBelt() {
        System.out.println("Fasten seat belts");
    }

    private void go() {
        System.out.println("Press the gas pedal");
    }

    public abstract void startTheIgnition();

    public abstract void setTheGear();
}
