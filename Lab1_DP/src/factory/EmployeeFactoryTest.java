package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.Employee;

class EmployeeFactoryTest {

	@Test
	void testEmployee() {
		
		Employee employee1 = EmployeeFactory.employee("Full Time", 0, "fff", "fff", "fff", "fff", 0);
		Employee employee2 = EmployeeFactory.employee("Part Time", 0, "fff", "fff", "fff", "fff", 0);
		
		assertTrue(employee1 instanceof FullTimeEmployee);
		assertTrue(employee2 instanceof PartTimeEmployee);
		assertThrowsExactly(
				IllegalArgumentException.class,
				() -> EmployeeFactory.employee("fff", 0, "fff", "fff", "fff", "fff", 0)
		);
		
	}

}
