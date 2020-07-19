package decorator.homework.meal;

public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Pour sauce over the meal.");
    }
}
