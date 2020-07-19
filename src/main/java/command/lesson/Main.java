package command.lesson;

import command.lesson.workshop.CoffeeMaker;
import command.lesson.workshop.Robot;
import command.lesson.workshop.WorkshopApp;
import command.lesson.workshop.command.*;

class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
//        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.addToQueue(new RobotCutCommand(robot));
//        workshopApp.addToQueue(new RobotDrillCommand(robot));
//        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
//
//        workshopApp.run();
//        workshopApp.run();
//        System.out.println("--------------------");
//
//        CoffeeMaker coffeeMaker = new CoffeeMaker();
//        workshopApp.addToQueue(new CoffeeMakerTurnOnCommand(coffeeMaker));
//        workshopApp.addToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));
//        workshopApp.run();

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();
    }
}
