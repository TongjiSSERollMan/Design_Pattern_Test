package observer;

import junit.framework.TestCase;
import org.junit.Test;

public class ObserverTest extends TestCase {
    @Test
    public void test(){
        // create observable peopleNum
        PeopleNum peopleNum = new PeopleNum();
        // create observers
        NumScreen numScreen = new NumScreen(peopleNum);
        EntranceEmployee entranceEmployee = new EntranceEmployee(peopleNum);
        // update peopleNum and observers
        peopleNum.setVal(30);
        peopleNum.setVal(-210);
        peopleNum.deleteObserver(entranceEmployee);
        EntranceEmployee entranceEmployee2 = new EntranceEmployee(peopleNum, 200);
        peopleNum.setVal(80);
        peopleNum.setVal(160);
        peopleNum.setVal(180);
    }
}
