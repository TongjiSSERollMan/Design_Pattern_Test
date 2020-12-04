package prototype;

import junit.framework.TestCase;
import org.junit.Test;

public class PrototypeTest extends TestCase {
    @Test
    public void test(){

        System.out.println("PrototypeTest:");

        System.out.println("Creating tickets...");
        Ticket ticket1 = new Ticket(30,"2020-4-23","AdultTicket");
        ticket1.giftticket = new Ticket(0,"2020-5-02","GiftTicket");
        Ticket ticket3 = new Ticket(30,"2020-8-16","AdultTicket");
        System.out.println();

        System.out.println("Shallow Copy...");
        Ticket ticket1_1 = (Ticket)ticket1.clone();
        Ticket ticket1_2 = (Ticket)ticket1.giftticket.clone();
        Ticket ticket2_1 = (Ticket)ticket3.clone();
        System.out.println();

        System.out.println("Check shallow copy object:");
        System.out.println(ticket1_1.getFormattedInfo());
        System.out.println(ticket1_2.getFormattedInfo());
        System.out.println(ticket2_1.getFormattedInfo());
        System.out.println();

        System.out.println("Deep Copy...");
        Ticket ticket1_3 = (Ticket)ticket1.deepClone();
        Ticket ticket2_3 = (Ticket)ticket3.deepClone();
        System.out.println();

        System.out.println("Check deep copy object:");
        System.out.println(ticket1_3.getFormattedInfo());
        System.out.println(ticket2_3.getFormattedInfo());
    }
}