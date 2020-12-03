package singleton;

import junit.framework.TestCase;
import org.junit.Test;

public class ClockTest extends TestCase {
    @Test
    public void test() {
        Clock clockOutsideTheParadise = Clock.getClock();
        Clock clockAtTheTicketCounter = Clock.getClock();
        Clock clockInTheRestaurant = Clock.getClock();

        System.out.println(clockOutsideTheParadise.getTime());
        System.out.println(clockAtTheTicketCounter.getTime());
        System.out.println(clockInTheRestaurant.getTime());

        clockAtTheTicketCounter.setTime("11:45:14");

        System.out.println(clockOutsideTheParadise.getTime());
        System.out.println(clockAtTheTicketCounter.getTime());
        System.out.println(clockInTheRestaurant.getTime());
    }
}
