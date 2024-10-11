package factory;

import singleton.Employee;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee() {
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
