package dirtyflag;

import org.junit.Test;

public class DirtyFlagTest {
    @Test
    public void testDirtyFlag() {
        ElectronicMenu menu = new ElectronicMenu();
        menu.show();
        menu.menuChange();
        menu.show();
    }
}
