package unit_tests;

import beverages.Beverage;
import beverages.Coffee;
import beverages.HotChocolate;
import beverages.Tea;
import beverages.additions.Cream;
import beverages.additions.Milk;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class BeveragesTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(),is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = new Milk(new Tea());
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }


    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new Cream( new HotChocolate());
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.55, 0.001)));
    }


}

