package decorator.lesson;

import decorator.lesson.terrain.*;

class Main {

    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain hill = new Hill();
        Terrain swampHill = new SwampDecorator(new Hill());
        Terrain swampForestPlain = new SwampDecorator(new ForestDecorator(new Plain()));

        Terrain terrain = new RoadDecorator(new Hill());

        System.out.println("Hill cost: " + hill.fuelCost());
        System.out.println("Swamp Hill cost: " + swampHill.fuelCost());
        System.out.println("Swamp Forest Plain cost: " + swampForestPlain.fuelCost());
        System.out.println(terrain.getDescription() + " Cost: " + terrain.fuelCost());
    }
}
