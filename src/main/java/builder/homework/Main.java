package builder.homework;

class Main {
    public static void main(String[] args) {

        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Kraków", "London").price(100).build();

        // throws exception
        // FlightLeg flightLeg2 = new FlightLeg.FlightLegBuilder("Katowice", "Berlin").build();

        flightLeg.setDelayed(true);
        System.out.println(flightLeg);
    }
}
