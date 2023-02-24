package beverages.additions;
import beverages.Beverage;


public class Cream implements Beverage {
    private Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() +  0.10;
    }
}