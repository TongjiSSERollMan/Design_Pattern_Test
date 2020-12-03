package delegation;

import junit.framework.TestCase;
import org.junit.Test;

public class DelegationTest extends TestCase {

    @Test
    public void testDelegation() {
        TicketOffice ticketOffice = new TicketOffice();

        ticketOffice.getYear("1","1","child");
        ticketOffice.getYear("2","2","adult");
    }
}
