import de.oszimt.aj3.contractMgmt.model.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTest {
    @Test
    void test1() {
        Customer c = new Customer("a",null,null, null, null);
        assertEquals("a",c.getFirstname());
    }
}
