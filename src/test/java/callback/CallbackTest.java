package callback;

import org.junit.Test;

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
