package builder.lesson;

import builder.lesson.house.classic.BigHouseBuilder;
import builder.lesson.house.classic.House;
import builder.lesson.house.classic.HouseDirector;
import builder.lesson.house.classic.SmallHouseBuilder;

class Main {
    public static void main(String[] args) {

        // created by implementation with inner class
        builder.lesson.house.innerclass.House innerClassHouse = new builder.lesson.house.innerclass.House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();

        System.out.println(innerClassHouse);
        System.out.println("---------------------------------");

        // created by classic implementation with interface and director
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
