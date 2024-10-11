package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.Employee;

class EmployeeDirectorTest {

	@Test
	void testBuildEmployee() {
		
		EmployeeDirector ed = new EmployeeDirector(new FullTimeEmployeeBuilder());
		Employee employee = ed.buildEmployee(1, "Job", "SSS", "SSS", "SSS", 0);
		
		assertEquals(employee.getId(), 1);
		assertEquals(employee.getName(), "Job");
		assertEquals(employee.getDepartment(), "SSS");
		assertEquals(employee.getRole(), "SSS");
		assertEquals(employee.getWorkingHoursPerWeek(), "SSS");
		assertEquals(employee.getSalary(), 0);
	}

}
