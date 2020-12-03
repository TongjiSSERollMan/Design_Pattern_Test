package immutable;

import junit.framework.TestCase;
import org.junit.Test;

public class ImmutableTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test Immutable: ");
        Building building = new Building("Ice Restaurant", "B1");
        BuildingInfo info = new BuildingInfo(building, 1919);
        System.out.println(info);
        building.setLocation("F2");
        building.setName("Service Center");
        System.out.println(info);
    }
}
