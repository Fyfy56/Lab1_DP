package EMS;

import builder.EmployeeDirector;
import factory.EmployeeFactory;
import singleton.Employee;
import singleton.EmployeeManager;

public class EMS {

	public static void main(String[] args) {
		 
		Employee employee1 = EmployeeFactory.employee("Full Time", 1, "fdsf", "dfsd", "fsf", "dfsdf", 4.0);
		Employee employee2 = EmployeeFactory.employee("Part Time", 2, "FSF", "dfsd", "fsf", "dfsdf", 4.0);
		Employee employee3 = EmployeeFactory.employee("Full Time", 3, "fDGDFGdsf", "dfsd", "fsf", "dfsdf", 4.0);
		Employee employee4 = EmployeeFactory.employee("Part Time", 4, "GFDG", "xgh", "fsf", "dfsdf", 4.0);
		Employee employee5 = EmployeeFactory.employee("Full Time", 5, "fhxhffdsf", "dfsd", "fsf", "dfsdf", 4.0);

		EmployeeManager.getInstance().addEmployees(employee1,employee2, employee3, employee4, employee5 );
		
		for(Employee employee : EmployeeManager.getInstance().employeesList()) {
			employee.clockIn();
			employee.clockOut();
			employee.trackHours();
			System.out.println();
		}
	}

}
