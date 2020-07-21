package strategy.lesson;

import strategy.lesson.chef.Chef;
import strategy.lesson.chef.egg_cooker.HardBoiledEggCooker;
import strategy.lesson.chef.egg_cooker.SoftBoiledEggCooker;

class Main {

    public static void main(String[] args) {

        // new order: hard-boiled eggs
        Chef chef = new Chef("John");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        // new order: soft-boiled eggs
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
