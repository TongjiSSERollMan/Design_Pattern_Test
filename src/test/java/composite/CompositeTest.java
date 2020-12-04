package composite;

import junit.framework.TestCase;
import org.junit.Test;

public class CompositeTest extends TestCase {

    @Test
    public void test() {
        Employee root = new Employee("DSY","root","touch fish", 100, 18);
        Employee son1 = new Employee("son1","son1","touch fish", 100, 18);
        Employee son2 = new Employee("son2","son2","touch fish", 100, 18);
        Employee son3 = new Employee("son3","son3","touch fish", 100, 18);
        root.add(son1);
        son1.add(son2);
        son2.add(son3);

        son1.remove(son2);

        System.out.println(root.getEmployeeList());
        System.out.println(son1.getEmployeeList());
        System.out.println(son2.getEmployeeList());
    }
}
