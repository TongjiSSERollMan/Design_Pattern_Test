package dependencyInjection;

import junit.framework.TestCase;
import org.junit.Test;

public class DependencyInjectionTest extends TestCase {
    @Test
    public void testDependencyInjection() {
        Tourist tourist = new Tourist();
        tourist.tourist(new SnowMobile());
        tourist.tourist(new SnowBowling());
    }
}