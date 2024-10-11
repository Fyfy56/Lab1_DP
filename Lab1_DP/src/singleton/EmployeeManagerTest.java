package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeManagerTest {

	@Test
	void testGetInstance() {
		
		EmployeeManager em1 = EmployeeManager.getInstance();
		EmployeeManager em2 = EmployeeManager.getInstance();
		EmployeeManager em3 = EmployeeManager.getInstance();
		
		assertTrue(em1 == em2 && em2 == em3);
		
	}

}
