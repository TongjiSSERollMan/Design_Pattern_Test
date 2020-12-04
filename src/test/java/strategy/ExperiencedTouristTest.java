package strategy;

import junit.framework.TestCase;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExperiencedTouristTest extends TestCase {
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    /**
     * 测试初始化
     */
    @Test
    public void testGet() {
        System.setOut(new PrintStream(outputStream));
        ExperiencedTourist tourist = new ExperiencedTourist(new goToChillingRestaurant());
        tourist.goToDestination();
        assertEquals("The Chilling Restaurant was reached by walking.", outputStream.toString().trim());
        System.setOut(originalSystemOut);
    }

    /**
     * 测试切换策略
     */
    @Test
    public void testChange() {
        System.setOut(new PrintStream(outputStream));
        ExperiencedTourist tourist = new ExperiencedTourist(new goToIceCanyon());
        tourist.goToDestination();
        assertEquals("Use the Gondola to reach the Ice Canyon", outputStream.toString().trim());
        outputStream.reset();

        System.setOut(new PrintStream(outputStream));
        tourist.changeMethod(new goToMidHillsideChalet());
        tourist.goToDestination();
        assertEquals("Reaching Mid-Hillside Chalet with a dog sled.", outputStream.toString().trim());
        outputStream.reset();
    }

    @Test
    public void testAll() {
        System.out.println("testAll");

        ExperiencedTourist tourist = new ExperiencedTourist(new goToIceCanyon());
        tourist.goToDestination();
        tourist.changeMethod(new goToMidHillsideChalet());
        tourist.goToDestination();
        tourist.changeMethod(new goToParadiseExit());
        tourist.goToDestination();
     }
}
