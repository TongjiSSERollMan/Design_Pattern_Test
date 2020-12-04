package factory;

import junit.framework.TestCase;
import org.junit.Test;

public class FactoryTest extends TestCase {

    @Test
    public void test() {
        System.out.println("Test factory pattern:");
        BuildFacility buildFacility = new BuildFacility();
        //build new facility, can be changed
        Facility skiFacility = buildFacility.build("ski facility");
        if(skiFacility != null) {
            skiFacility.build();
        }
        Facility skiField = buildFacility.build("ski field");
        if(skiField != null) {
            skiField.build();
        }
        Facility tourCar = buildFacility.build("tour car");
        if(tourCar != null) {
            tourCar.build();
        }
        Facility iceSculpturePark = buildFacility.build("Ice sculpture park");
        if(iceSculpturePark != null) {
            iceSculpturePark.build();
        }
    }
}
