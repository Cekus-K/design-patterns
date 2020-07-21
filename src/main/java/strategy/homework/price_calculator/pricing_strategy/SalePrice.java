package strategy.homework.price_calculator.pricing_strategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Discounted price is: " + (price / 2));
        } else {
            System.out.println("You are not signed up for newsletter! Please choose a different pricing strategy.");
        }
    }
}
