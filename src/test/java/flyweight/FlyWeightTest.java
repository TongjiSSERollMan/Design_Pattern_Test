package flyweight;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyWeightTest extends TestCase {
    @Test
    public void test(){

        AbstractCoinFactory GoldCoinFactory = new GoldCoinFactory();
        BigCoin firstBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_1 = firstBigCoin.hashCode();
        System.out.println("(" + this.toString() + ") : " + "First BigCoin's Hash code is: " + hashCode_1);

        BigCoin secondBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_2 = secondBigCoin.hashCode();
        System.out.println("(" + this.toString() + ") : " + "Second BigCoin's Hash code is: " + hashCode_2);

        assertEquals(hashCode_1, hashCode_2);
        System.out.println("(" + this.toString() + ") : " + "The hashCode of two consecutively obtained instance objects is the same" +
                " Means they share the same memory space");
    }
}
