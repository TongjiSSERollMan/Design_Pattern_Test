package nullobject;

import junit.framework.TestCase;
import org.junit.Test;


public class NullObjectTest extends TestCase {
    @Test
    public  void test() {
        System.out.println("NullObject Test Start");

        System.out.println("\tCreate 0001 and 0010\n");
        System.out.println("\t0001 is in the Ticket Database");
        System.out.println("\t0010 is not in the Ticket Database\n");

        Stub stub1 = new Stub("0001","0001");
        Stub stub2 = new Stub("0010","0010");

        TicketFinder finder_test = new TicketFinder();

        System.out.println("\tWe can find 0001:");
        Ticket t1 = finder_test.Find(stub1);

        System.out.println("\t"+t1.getInfo());

        System.out.println("\tBut 0010 is an invalid Ticket:");
        Ticket t2 = finder_test.Find(stub2);
        System.out.println("\t"+t2.getInfo());

        System.out.println("\nNullObject Test Finish");
    }
}
