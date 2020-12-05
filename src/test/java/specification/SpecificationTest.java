package specification;

import java.util.ArrayList;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import specification.facility.*;
import specification.selector.*;



public class SpecificationTest extends TestCase {

    @Test
    public void test() {
        List<Facility> facilityList = new ArrayList<>();
        facilityList.add(new RollerCaster());
        facilityList.add(new MerryGoRound());
        facilityList.add(new HauntedHouse());
        facilityList.add(new PirateShip());
        facilityList.add(new RoaringRapids());
        facilityList.add(new MadHatterTeaCups());
        for(Facility facility:facilityList){
            System.out.println(facility.getName() + facility.getFacilityType() +
                    facility.getFacilitySuitableAge() + facility.getFacilityThrillLevel());
        }
        List<Facility> outdoorFacilityList = facilityList
            .stream()
            .filter(new FacilityTypeSelector(FacilityType.OUTDOOR))
            .collect(Collectors.toList());
        for(Facility facility:outdoorFacilityList){
            System.out.println(facility.getName() + facility.getFacilityType());
        }
        List<Facility> scaryFacilityList = facilityList
            .stream()
            .filter(new FacilityThrillLevelSelector(FacilityThrillLevel.SCARY))
            .collect(Collectors.toList());
        for(Facility facility:scaryFacilityList){
            System.out.println(facility.getName() + facility.getFacilityThrillLevel());
        }
        List<Facility> outdoorTweenFacilityList = facilityList
            .stream()
            .filter(new FacilityTypeSelector(FacilityType.OUTDOOR))
            .filter(new FacilitySuitableAgeSelector(FacilitySuitableAge.KIDS))
            .collect(Collectors.toList());
        for(Facility facility:outdoorFacilityList){
            System.out.println(facility.getName() + facility.getFacilityType() + facility.getFacilitySuitableAge());
        }
    }
}
