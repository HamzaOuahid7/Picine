package beverages.additions;
import beverages.Beverage;


public class Milk implements Beverage {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() +  0.10;
    }
}
