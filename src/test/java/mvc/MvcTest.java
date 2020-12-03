package mvc;

import junit.framework.TestCase;
import org.junit.Test;

public class MvcTest extends TestCase {
    @Test
    public void test(){
        UserReview test_model = getReview();
        UserReviewView test_view = new UserReviewView();
        UserReviewController test_controller = new UserReviewController(test_model, test_view);
        test_controller.updateView();
        test_controller.setUserId("ABC123");
        test_controller.setStars(3);
        test_controller.setReview("Nice!");
        test_controller.updateView();
    }

    private static UserReview getReview(){
        return new UserReview("DEF456", "Terrible!", 1);
    }
}
