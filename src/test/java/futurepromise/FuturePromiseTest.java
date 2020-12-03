package futurepromise;

import junit.framework.TestCase;
import org.junit.Test;

public class FuturePromiseTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test Future Promise: ");
        Kitchen kitchen = new Kitchen();
        Dishes dish0 = new Dishes("Ice Cream", 12);
        Dishes dish1 = new Dishes("Bubble Tea", 2);
        System.out.println("Begin sending requests to the kitchen: ");
        Order order0 = kitchen.request(dish0);
        Order order1 = kitchen.request(dish1);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All Orders are completed.");
    }
}
