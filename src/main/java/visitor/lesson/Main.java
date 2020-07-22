package visitor.lesson;

import visitor.lesson.activity.Activity;
import visitor.lesson.activity.Squash;
import visitor.lesson.activity.Treadmill;
import visitor.lesson.activity.Weights;
import visitor.lesson.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("-------------------------");

        List<Activity> activities = Arrays.asList(treadmill, squash, weights);
        activities.forEach(activity -> activity.accept(visitor));
    }
}
