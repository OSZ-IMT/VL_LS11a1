import de.oszimt.ls11a1.model.customer.Customer;
import de.oszimt.ls11a1.model.customer.CustomerMgmt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Customer mgmt test class
 *
 * @author Steffen Trutz
 * @version 1.1
 */
class TestModelCustomerMgmt {

	CustomerMgmt customers;

	@BeforeEach
	void init(){
		customers = new CustomerMgmt();

		//testdata
		Customer c = new Customer(0, "lastName", "firstName");
		customers.add(c);
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

	@Test
	void testFreeNextID() {
		assertEquals(1,customers.getNextFreeID());
	}

	/**
	 * Dieser Test funktioniert nur, wenn die 3 Sterne Aufgabe erledigt wurde.
	 */
	@Test
	void testFreeNextIDSterne3() {
		Customer c = new Customer(2, "last", "first");
		customers.add(c);

		assertEquals(1,customers.getNextFreeID());
	}

}
