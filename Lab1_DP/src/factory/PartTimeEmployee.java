package factory;

import singleton.Employee;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee() {
		super();
	}

	@Override
	public void clockIn() {
		System.out.println(this.getName() + " has clocked in");
		
	}

	@Override
	public void clockOut() {
		System.out.println(this.getName() + " has clocked out");
		
	}

	@Override
	public void trackHours() {
		System.out.println("Tracking hours for " + this.getName());
		
	}

}
