package templatemethod.homework;

abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void wakeUp() {
        System.out.println("waking up");
    }

    private void getReady() {
        System.out.println("getting ready to go out");
    }

    private void goHome() {
        System.out.println("going home");
    }

    private void summary(int time) {
        System.out.println("the route to work took " + time + " minutes");
    }

    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    protected abstract void work();
}
