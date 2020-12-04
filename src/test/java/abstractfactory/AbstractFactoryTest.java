package abstractfactory;

import junit.framework.TestCase;
import org.junit.Test;

public class AbstractFactoryTest extends TestCase {

    @Test
    public void test(){
        System.out.println("Test abstract factory:");
        FacilityFactory factory;
        factory=new PolarBearFacilityFactory();
        BumperCar bumperCar = factory.createBumperCar();
        bumperCar.play();
        factory=new PenguinFacilityFactory();
        Restaurant restaurant = factory.createRestaurant();
        restaurant.eat();
        factory=new SealFacilityFactory();
        RollerCoaster rollerCoaster = factory.createRollerCoaster();
        rollerCoaster.play();
    }
}