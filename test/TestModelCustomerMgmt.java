import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.model.customer.CustomerMgmt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Customer mgmt test class
 *
 * @author Steffen Trutz
 * @version 1
 */
class TestModelCustomerMgmt {

	CustomerMgmt customers;

	@BeforeEach
	void init(){
		customers = new CustomerMgmt();
	}

	@Test
	void testAddSize() {
		int size = customers.size();
		Customer c = new Customer(customers.getNextFreeID(), "last", "first");
		customers.add(c);

		assertEquals(size+1,customers.size());
	}

	@Test
	void testAddContent() {
		Customer c = new Customer(customers.getNextFreeID(), "last", "first");
		customers.add(c);

		assertEquals("last",customers.get(customers.size()-1).getLastname());
	}

	@Test
	void testDelete() {
		int size = customers.size();
		customers.remove(customers.get(0));

		assertEquals(size-1,customers.size());
	}

}
