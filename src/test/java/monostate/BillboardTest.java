package monostate;

import balking.Bill;
import junit.framework.TestCase;
import org.junit.Test;

public class BillboardTest extends TestCase {

    /**
     * 测试默认构造函数的合理性
     */
    @Test
    public void testGet(){
        System.out.println("testGet");

        Billboard billboard = new Billboard();
        assertEquals("Welcome to IceParadise!", billboard.getTodayNews());
        System.out.println(billboard.getTodayNews());
    }

    /**
     * 测试setter的合理性，是否符合该设计模式意图
     */
    @Test
    public void testSet() {
        System.out.println("testGet");

        Billboard billboard = new Billboard();
        Billboard otherBillboard = new Billboard();
        billboard.setTodayNews("TESTCASE");
        assertEquals("TESTCASE", billboard.getTodayNews());
        assertEquals("TESTCASE", otherBillboard.getTodayNews());
        System.out.println(billboard.getTodayNews());
        System.out.println(otherBillboard.getTodayNews());
    }

    /**
     * 测试Cloneable的接口是否符合约定
     */
    @Test
    public void testClone() {
        System.out.println("testClone");

        Billboard billboard = new Billboard();
        try {
            Billboard otherBillboard = (Billboard) billboard.clone();
            assertEquals("Welcome to IceParadise!", otherBillboard.getTodayNews());
            System.out.println(billboard.getTodayNews());
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            System.out.println("clone不支持");
        } catch (Exception exception) {
            System.out.println("clone实现有误");
        }
    }

    /**
     * 测试派生类
     */
    @Test
    public void testInherit() {
        InheritedBillboard inheritedBillboard = new InheritedBillboard();
        inheritedBillboard.setTodayNews("TESTCASE");
        assertEquals("TESTCASE", inheritedBillboard.getTodayNews());
        System.out.println(inheritedBillboard.getTodayNews());
    }
}

class InheritedBillboard extends Billboard{

}
