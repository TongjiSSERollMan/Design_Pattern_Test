package state;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;


public class StateTest extends TestCase {

    @Test
    public void test() {
        Device device = new Device();
        device.doUse();
        device.doOn();
        device.doUse();
        device.doOff();
        device.doDown();
        device.doUse();
        device.doFix();
        device.doUse();
    }
}
