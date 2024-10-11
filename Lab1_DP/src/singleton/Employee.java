package singleton;
import builder.EmployeeBuilder;



/**
 *
 * @author fiorela
 */
public abstract class Employee{
	private int id;
    private String name;
    private String department;
    private String role;
    private String workingHoursPerWeek;
    private double salary; 
    
    public Employee() {
    	
    }
    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the workingHoursPerWeek
	 */
	public String getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	/**
	 * @param workingHoursPerWeek the workingHoursPerWeek to set
	 */
	public void setWorkingHoursPerWeek(String workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//Abstract Methods
	public abstract void clockIn();
    
    public abstract void clockOut();
    
    public abstract void trackHours();
	
    
    
}