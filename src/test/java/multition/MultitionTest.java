package multition;

import junit.framework.TestCase;
import org.junit.Test;

public class MultitionTest extends TestCase  {
    @Test
    public void test() {
        System.out.println("Multition Test Start");
        for(int i = 0;i<4;i++){
            System.out.println("\t"+ChairMultition.getInstance(i).getInfo());
        }
        System.out.println("\t"+ChairMultition.getInstance(190));
        System.out.println("Multition Test Finish");
    }
}
