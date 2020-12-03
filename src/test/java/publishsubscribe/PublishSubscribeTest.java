package publishsubscribe;

import junit.framework.TestCase;
import org.junit.Test;

public class PublishSubscribeTest extends TestCase {
    @Test
    public void test(){
        Application app = new Application();
        EntertainmentController entertainmentController = new EntertainmentController(app);
        VisitorController subscriberController = new VisitorController(app);
        subscriberController.subscribe("visitor1","entertainment1");
        subscriberController.subscribe("visitor2","entertainment2");
        entertainmentController.publish("entertainment1","entertainment1");
        entertainmentController.publish("entertainment2","entertainment2");
        subscriberController.unsubscribe("visitor2","entertainment2");
        subscriberController.subscribe("visitor1","entertainment1");
        subscriberController.unsubscribe("visitor2","entertainment2");
    }
}
