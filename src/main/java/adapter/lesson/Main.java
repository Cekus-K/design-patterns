package adapter.lesson;

import adapter.lesson.adapter.*;

class Main {

    public static void main(String[] args) {

        ContinentalDevice plRadio = () -> System.out.println("Gra muzyka");
        ContinentalSocket plSocket = new ContinentalSocket();
        plSocket.plugIn(plRadio);

        UKDevice ukRadio = () -> System.out.println("London calling to the faraway towns");
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        plSocket.plugIn(adapter);

        ContinentalToUKAdapter adapter2 = new ContinentalToUKAdapter(plRadio);
        ukSocket.plugIn(adapter2);

        System.out.println("-------------------------------");

        ContinentalDevice continentalRadio = () -> System.out.println("London calling to the underworld");

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(ukRadio, continentalRadio);
        plSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);
    }
}
