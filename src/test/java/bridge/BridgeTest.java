package bridge;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test bridge:");
        BigStage bigStage = new BigStage(new DancePerformance());
        SmallStage smallStage = new SmallStage(new SingPerformance());
        bigStage.doPerform();
        smallStage.doPerform();
        SmallStage smallStage1 = new SmallStage(new DancePerformance());
        smallStage1.doPerform();
    }
}
