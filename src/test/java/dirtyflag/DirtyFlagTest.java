package dirtyflag;

import junit.framework.TestCase;
import org.junit.Test;

public class DirtyFlagTest extends TestCase {
    @Test
    public void testDirtyFlag() {
        ElectronicMenu menu = new ElectronicMenu();
        menu.show();
        menu.menuChange();
        menu.show();
    }
}
