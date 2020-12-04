package transferObject;

import junit.framework.TestCase;
import org.junit.Test;

public class TransferObjectTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Transfer Object Test BEGIN: ");
        UserBO myTestUserBO = new UserBO();
        System.out.println("Current Objects: ");
        for(UserVO user:myTestUserBO.getAllUsers()) {
            System.out.println("[user_id="+user.getUserId()+", username="+user.getName()+"]");
        }
        System.out.println();
        myTestUserBO.addUser(new UserVO("Rika", "D-1055"));
        System.out.println("Current Objects: ");
        for(UserVO user:myTestUserBO.getAllUsers()) {
            System.out.println("[user_id="+user.getUserId()+", username="+user.getName()+"]");
        }
        System.out.println();
        UserVO testUser = myTestUserBO.getUser(0);
        System.out.println("[user_id="+testUser.getUserId()+", username="+testUser.getName()+"]");
        testUser.setName("Satoko");
        System.out.println("Current Objects: ");
        for(UserVO user:myTestUserBO.getAllUsers()) {
            System.out.println("[user_id="+user.getUserId()+", username="+user.getName()+"]");
        }
        System.out.println();
        myTestUserBO.deleteUser(testUser);
        System.out.println("Current Objects: ");
        for(UserVO user:myTestUserBO.getAllUsers()) {
            System.out.println("[user_id="+user.getUserId()+", username="+user.getName()+"]");
        }
        System.out.println();
        System.out.println("Transfer Object Test END.");
    }
}
