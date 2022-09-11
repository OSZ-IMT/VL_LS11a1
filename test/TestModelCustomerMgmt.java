import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.model.customer.CustomerMgmt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Customer test class
 *
 * @author Steffen Trutz
 */
class TestModelCustomerMgmt {

	CustomerMgmt customers;

	@BeforeEach
	void init(){
		customers = new CustomerMgmt();
	}

	@Test
	void testAddSize() {
		Customer c = new Customer(3, "last", "first");
		customers.add(c);

		assertEquals(4,customers.size());
	}

	@Test
	void testAddContent() {
		Customer c = new Customer(3, "last", "first");
		customers.add(c);

		assertEquals("last",customers.get(customers.size()-1).getLastname());
	}

}
