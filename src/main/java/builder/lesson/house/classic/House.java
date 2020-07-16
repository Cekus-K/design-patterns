package builder.lesson.house.classic;

public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String garage;

    String getWalls() {
        return walls;
    }

    void setWalls(String walls) {
        this.walls = walls;
    }

    String getFloors() {
        return floors;
    }

    void setFloors(String floors) {
        this.floors = floors;
    }

    String getRooms() {
        return rooms;
    }

    void setRooms(String rooms) {
        this.rooms = rooms;
    }

    String getRoof() {
        return roof;
    }

    void setRoof(String roof) {
        this.roof = roof;
    }

    String getWindows() {
        return windows;
    }

    void setWindows(String windows) {
        this.windows = windows;
    }

    String getGarage() {
        return garage;
    }

    void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
