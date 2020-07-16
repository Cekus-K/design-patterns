package builder.homework;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.price = builder.price;
        this.delayed = builder.delayed;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private int price;
        private boolean delayed;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (this.price == 0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }
}
