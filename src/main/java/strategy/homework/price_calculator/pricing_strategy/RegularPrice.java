package strategy.homework.price_calculator.pricing_strategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Regular price is: " + price);
        } else {
            System.out.println("You are signed up for newsletter! Please choose a different pricing strategy.");
        }
    }
}
