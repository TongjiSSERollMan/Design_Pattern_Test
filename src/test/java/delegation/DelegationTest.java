package delegation;

import org.junit.Test;

public class DelegationTest {

    @Test
    public void testDelegation() {
        TicketOffice ticketOffice = new TicketOffice();

        ticketOffice.getYear("1","1","child");
        ticketOffice.getYear("2","2","adult");
    }
}
