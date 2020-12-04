package frontcontroller;

import junit.framework.TestCase;
import org.junit.Test;

public class FrontControllerTest extends TestCase {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "FrontController:");
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME", "JJF");
        frontController.dispatchRequest("HOME", "admin");
        frontController.dispatchRequest("PLAYER", "JJF");
        frontController.dispatchRequest("PLAYER", "Admin");
    }
}
