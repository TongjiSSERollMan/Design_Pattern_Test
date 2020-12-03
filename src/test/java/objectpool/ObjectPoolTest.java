package objectpool;

import junit.framework.TestCase;
import objectpool.*;
import org.junit.Test;

public class ObjectPoolTest extends TestCase {

    @Test
    public void test() {
        System.out.println("object pool Test Start");
        PolarizedGlassPool pool_test = new PolarizedGlassPool();
        System.out.println("Pool created.");
        System.out.println(pool_test.toString());
        System.out.println("Will check out three PolarizedGlass..");
        PolarizedGlass PolarizedGlass1 = pool_test.checkOut();
        String checkedOut = "Checked out ";
        System.out.println(checkedOut + PolarizedGlass1);
        System.out.println(pool_test.toString());
        PolarizedGlass PolarizedGlass2 = pool_test.checkOut();
        System.out.println(checkedOut + PolarizedGlass2);
        PolarizedGlass PolarizedGlass3 = pool_test.checkOut();
        System.out.println(checkedOut + PolarizedGlass3);
        System.out.println(pool_test.toString());
        System.out.println("Will return two PolarizedGlass..");
        System.out.printf("Checking in %s\n", PolarizedGlass1);
        pool_test.checkIn(PolarizedGlass1);
        System.out.printf("Checking in %s\n", PolarizedGlass2);
        pool_test.checkIn(PolarizedGlass2);
        System.out.println(pool_test.toString());
        System.out.println("Will checkout two PolarizedGlass..");
        PolarizedGlass PolarizedGlass4 = pool_test.checkOut();
        System.out.println(checkedOut + PolarizedGlass4);
        PolarizedGlass PolarizedGlass5 = pool_test.checkOut();
        System.out.println(checkedOut + PolarizedGlass5);
        System.out.println(pool_test.toString());
        System.out.println("Check PolarizedGlass's ID!");
    }
}
