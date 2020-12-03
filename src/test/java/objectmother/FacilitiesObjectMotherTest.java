package objectmother;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FacilitiesObjectMotherTest extends TestCase {
    @Test
    public void test() {
        FacilitiesObjectMother facilitiesObjectMother = new FacilitiesObjectMother();
        TraditionalFacilities bicycleCenter = facilitiesObjectMother.createUndamagedTraditionalFacilities();
        TraditionalFacilities toilet = facilitiesObjectMother.createDamagedTraditionalFacilities();
        ElectronicFacilities slides = facilitiesObjectMother.createPowerOnDamagedElectronicFacilities();
        ElectronicFacilities jumpers = facilitiesObjectMother.createPowerOnUndamagedElectronicFacilities();
        ElectronicFacilities bumperCars = facilitiesObjectMother.createPowerOffDamagedElectronicFacilities();
        ElectronicFacilities elevator = facilitiesObjectMother.createPowerOffUndamagedElectronicFacilities();

        System.out.print("TraditionalFacilities:getInstance:("+bicycleCenter.hashCode()+"): ");
        System.out.print("Bicycle Center: ");
        bicycleCenter.enter();
        System.out.print("TraditionalFacilities:getInstance:("+toilet.hashCode()+"): ");
        System.out.print("Toilet: ");
        toilet.enter();
        System.out.print("ElectronicFacilities:getInstance:("+slides.hashCode()+"): ");
        System.out.print("Slides: ");
        slides.enter();
        System.out.print("ElectronicFacilities:getInstance:("+jumpers.hashCode()+"): ");
        System.out.print("Jumpers: ");
        jumpers.enter();
        System.out.print("ElectronicFacilities:getInstance:("+bumperCars.hashCode()+"): ");
        System.out.print("Bumper Cars: ");
        bumperCars.enter();
        System.out.print("ElectronicFacilities:getInstance:("+elevator.hashCode()+"): ");
        System.out.print("Elevator: ");
        elevator.enter();
    }
}
