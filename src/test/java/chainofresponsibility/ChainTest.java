package chainofresponsibility;

import junit.framework.TestCase;
import org.junit.Test;

public class ChainTest extends TestCase {

    @Test
    public void test() {

        HandleChain chain = new HandleChain();

        chain.handle(new Complaint(Complaint.ComplaintType.SERVICE));
        chain.handle(new Complaint(Complaint.ComplaintType.ENVIRONMENT));
        chain.handle(new Complaint(Complaint.ComplaintType.FACILITY));

    }
}
