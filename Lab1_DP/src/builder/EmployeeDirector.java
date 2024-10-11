package builder;
import singleton.Employee;

public class EmployeeDirector {
	private EmployeeBuilder builder;
	
	public EmployeeDirector(EmployeeBuilder builder) {
		this.builder = builder;
	}
	
	public Employee buildEmployee(int id, String name, String department, String role, String workingHoursPerWeek, double salary) {
		
		this.builder.setId(id).setName(name).setDepartment(department).setRole(role).setWorkingHoursPerWeek(workingHoursPerWeek).setSalary(salary);
		return this.builder.build();
		
	}
	
}
