package beverages.additions;
import beverages.Beverage;


public class Cinnamon implements Beverage {
    private Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() +  0.05;
    }
}