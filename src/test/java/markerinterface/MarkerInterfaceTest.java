package markerinterface;

import junit.framework.TestCase;
import org.junit.Test;

public class MarkerInterfaceTest extends TestCase {

    private boolean enterable (Object object) {
        return (object instanceof Permission);
    }

    /**
     * 测试的保安类的实现
     */
    @Test
    public void testGuard() {
        System.out.println("testGuard");
        Guard guard = new Guard();

        assertTrue(enterable(guard));
        if (enterable(guard)) {
            guard.enter();
        } else {
            System.out.println("(" + this.toString() + ") : " + "have no permission");
            fail();
        }
    }

    /**
     * 测试盗贼类的实现
     */
    @Test
    public void testThief() {
        System.out.println("testThief");

        Thief thief = new Thief();

        assertFalse(enterable(thief));
        if (enterable(thief)) {
            thief.steal();
            fail();
        } else {
            thief.doNothing();
        }
    }
}
