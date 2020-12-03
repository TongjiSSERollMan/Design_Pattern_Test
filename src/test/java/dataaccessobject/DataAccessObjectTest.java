package dataaccessobject;

import junit.framework.TestCase;
import org.junit.Test;

public class DataAccessObjectTest extends TestCase {
    @Test
    public void testDataAccessObject(){
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer1 = new Customer(1752459, "z", "z");
        Customer customer2 = new Customer(1752985, "xd", "l");

        customerDao.updateCustomer(customer1);
        customerDao.getCustomer();

        customerDao.updateCustomer(customer2);
        customerDao.getCustomer();
    }
}
