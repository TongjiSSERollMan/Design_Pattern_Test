package iterator;

import junit.framework.TestCase;
import org.junit.Test;

public class IteratorTest extends TestCase {

    @Test
    public void test() {
        TouristsInLine line = new TouristsInLine();
        System.out.println("\n1# Iterator Test");

        TouristInLineIterator adultsIterator = line.iterator(TouristType.ADULTS);
        TouristInLineIterator anyIterator = line.iterator(TouristType.ANY);
        TouristInLineIterator militaryIterator = line.iterator(TouristType.MILITARY);
        TouristInLineIterator childrenIterator = line.iterator(TouristType.CHILDREN);
        TouristInLineIterator childrenIterator2 = line.iterator(TouristType.CHILDREN);

        while (anyIterator.hasNext()) {
            System.out.print(anyIterator.next().toString()+" ");
        }
        while (adultsIterator.hasNext()) {
            System.out.print(adultsIterator.next().toString()+" ");
        }

        while (militaryIterator.hasNext()) {
            System.out.print(militaryIterator.next().toString()+" ");
        }

        while (childrenIterator.hasNext()) {
            System.out.print(childrenIterator.next().toString()+" ");
        }

        line.append(TouristType.CHILDREN, "Goodman");
        while (childrenIterator2.hasNext()) {
            System.out.print(childrenIterator2.next().toString()+" ");
        }
    }
}
