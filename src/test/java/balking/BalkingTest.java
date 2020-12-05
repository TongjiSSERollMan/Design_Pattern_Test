package balking;

import junit.framework.TestCase;
import org.junit.Test;


public class BalkingTest extends TestCase {
    @Test
    public void test() throws InterruptedException {
        Bill bill =new Bill();
        CustomerThread customerThread=new CustomerThread("customerXiaoMing", bill);
        WaiterThread waiterThread=new WaiterThread("waiterXiaoHong", bill);
        customerThread.start();
        waiterThread.start();
        customerThread.join();
        waiterThread.join();

    }
}
