package visitor;

import junit.framework.TestCase;
import org.junit.Test;

public class VisitorTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Visitor Test BEGIN: ");
        Manager manager = new Manager(
            "Hanyuu",
            new ViceManager(
                "Rika",
                new Staff("D-2304"),
                new Staff("D-3241")
            ),
            new ViceManager(
                "Satoko",
                new Staff("D-5371"),
                new Staff("D-0062")
            )
        );
        System.out.println("Staff Visitor Test: ");
        manager.accept(new StaffVisitor());
        System.out.println();
        System.out.println("Vice Manager Visitor Test: ");
        manager.accept(new ViceManagerVisitor());
        System.out.println();
        System.out.println("Manager Visitor Test: ");
        manager.accept(new ManagerVisitor());
        System.out.println();
        System.out.println("Visitor Test END.");
    }
}
