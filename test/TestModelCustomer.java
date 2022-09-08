import static org.junit.jupiter.api.Assertions.*;

import de.oszimt.ls11a1.model.Customer;
import org.junit.jupiter.api.Test;

/**
 * Customer test class
 *
 * @author Steffen Trutz
 */
class TestModelCustomer {

	@Test
	void testConstructor() {
		Customer c = new Customer(1, "last", "first");

		assertEquals(1,c.getCustomerID());
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
