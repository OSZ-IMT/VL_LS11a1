import de.oszimt.ls11a1.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Model test class
 *
 * @author Steffen Trutz
 * @version 1
 */
class TestModel {

	Model model;

	@BeforeEach
	void init(){
		model = new Model();
	}

	@Test
	void testCustomerMgmt() {
		assertEquals("Mira",model.getCustomers().get(0).getFirstname());
	}

}
