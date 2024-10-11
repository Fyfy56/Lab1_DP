package builder;
import singleton.Employee;

public interface EmployeeBuilder {
	EmployeeBuilder setId(int id);
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHoursPerWeek(String workingHoursPerWeek);
    EmployeeBuilder setSalary(double salary);
    Employee build();
}