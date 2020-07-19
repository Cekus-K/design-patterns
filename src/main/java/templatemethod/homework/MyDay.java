package templatemethod.homework;

class MyDay extends WeekDay {

    @Override
    public int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case BIKE:
                return 30;
            case TRAM:
                return 25;
            case CAR:
                return 15;
            default:
                return 20;
        }
    }

    @Override
    public void work() {
        System.out.println("Code, StackOverflow, Code, coffee, repeat..");
    }
}
