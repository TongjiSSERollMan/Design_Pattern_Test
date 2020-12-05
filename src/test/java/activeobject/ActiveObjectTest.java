package activeobject;

import junit.framework.TestCase;
import org.junit.Test;

public class ActiveObjectTest extends TestCase {
    @Test
    public  void test() {
        try {
            NotifyThread notifyThread=new NotifyThread("Notification",30);
            SolveEventThread solveEventThread =
                    new SolveEventThread("Customer", ActiveObjectFactory.createActiveObject(),notifyThread, 30);
            solveEventThread.start();
            solveEventThread.join();
            notifyThread.join();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
