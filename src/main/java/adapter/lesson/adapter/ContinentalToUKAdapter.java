package adapter.lesson.adapter;

public class ContinentalToUKAdapter implements UKDevice {

    private ContinentalDevice device;

    public ContinentalToUKAdapter(ContinentalDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.on();
    }
}
