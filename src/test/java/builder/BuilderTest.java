package builder;

import junit.framework.TestCase;
import org.junit.Test;

public class BuilderTest extends TestCase {
    @Test
    public void test(){
        Waiter waiter = new Waiter();
        // test chickenBurger
        waiter.setMealBuilder(new ChickenBurgerMealBuilder());
        waiter.prepareMeal();
        Meal chickenBurger = waiter.getMeal();
        chickenBurger.showItems();
        // test hamburger
        waiter.setMealBuilder(new HamburgerMealBuilder());
        waiter.prepareMeal();
        Meal hamburger = waiter.getMeal();
        hamburger.showItems();


    }
}
