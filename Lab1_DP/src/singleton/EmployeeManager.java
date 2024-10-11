package singleton;
import java.util.ArrayList;
import java.util.List;

	/**
	 *
	 * @author fiorela
	 */
public class EmployeeManager {

	    private static EmployeeManager employeeManager;
	    private List<Employee> employeeList;

	    private EmployeeManager() {
	        employeeList = new ArrayList<>();
	    }

	    public static EmployeeManager getInstance() {

	        if (employeeManager == null) {
	            employeeManager = new EmployeeManager();
	        }

	        return employeeManager;

	    }
	    
	    public void addEmployee(Employee employee){
	        employeeList.add(employee);
	    }
	    
	    public void addEmployees(Employee... employees){
	        for (Employee employee: employees) {
	        	this.addEmployee(employee);
	        }
	    }
	    
	    public void removeEmployee(Employee employee){
	        employeeList.remove(employee);
	    }
	    
	    public Employee getEmployee(int id){
	        for(Employee employee : employeeList){
	            if (employee.getId() == id){
	                return employee;
	            }
	        }
			return null;
	    }
	    
	    public List<Employee> employeesList(){
	    	return employeeList;
	    }
	    
}

