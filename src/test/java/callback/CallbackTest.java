package callback;

import org.junit.Test;

/**
 * @Title: CallbackTest.java
 *
 * @Package callback
 *
 * @Description: Add a field as a counter of people go to bathroom.  Add Unit
 *  * test checks that the field is being incremented.
 *
 * @author Jiajie
 *
 * @date 2020/11/28
 */
public class CallbackTest {
    private Long callingCount = Long.valueOf(0);
    @Test
    public void test() {

        Callback callback = () -> callingCount++;
        goToTheBathroom task = new goToTheBathroom();

        task.executeWith(callback);
        System.out.println(callingCount.toString());
        task.executeWith(callback);
        System.out.println(callingCount.toString());
        task.executeWith(callback);
        System.out.println(callingCount.toString());
    }
}
