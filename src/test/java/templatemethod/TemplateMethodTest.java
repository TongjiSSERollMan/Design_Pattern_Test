package templatemethod;

import junit.framework.TestCase;
import org.junit.Test;

public class TemplateMethodTest extends TestCase  {
    @Test
    public void test() {
        System.out.println("Template Method Test BEGIN: ");
        System.out.println("Initializing test cabin...");
        HalflingCabin cabinTest = new HalflingCabin(
            "cabinTest",
            new MyTestCabin()
        );
        System.out.println("Staff Coming...");
        cabinTest.visitedBy("D-1024");
        System.out.println("Testing Existing Cabin...");
        HalflingCabin cabinOld = new HalflingCabin(
            "cabinOld",
            new HardSeatCabin()
        );
        System.out.println("Staff Coming...");
        cabinOld.visitedBy("D-1079");
        System.out.println("Template Method Test END.");
    }
}

class MyTestCabin extends TrainCabin{
    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(
                String.format(
                        "(" +
                                this.toString() +
                                "): " +
                                "%s is testing in %s. This cabin is only for tests.",
                        customer,
                        cabinName
                )
        );
    }
}
