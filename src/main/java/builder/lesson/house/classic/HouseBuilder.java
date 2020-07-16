package builder.lesson.house.classic;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildGarage();

    House getHouse();
}
