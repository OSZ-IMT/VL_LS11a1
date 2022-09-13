import de.oszimt.ls11a1.model.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Customer test class
 *
 * @author Steffen Trutz
 * @version 1
 */
class TestModelCustomer {

	@Test
	void testConstructor() {
		Customer c = new Customer(1, "last", "first");

		assertEquals(1,c.getId());
		assertEquals("last",c.getLastname());
		assertEquals("first",c.getFirstname());
	}

	@Test
	void testConstructorComplex() {
		Customer c = new Customer(1, "last", "first", "email", "tel");

		assertEquals("email",c.getEmail());
		assertEquals("tel",c.getTel());
	}

	@Test
	void testSet() {
		Customer c = new Customer(0, null, null);

		c.setFirstname("first");
		assertEquals("first",c.getFirstname());

		c.setLastname("last");
		assertEquals("last",c.getLastname());

		c.setEmail("email");
		assertEquals("email",c.getEmail());

		c.setTel("tel");
		assertEquals("tel",c.getTel());
	}

}
