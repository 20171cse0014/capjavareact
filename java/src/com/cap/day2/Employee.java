package com.cap.day2;

public class Employee {
	// Fields
		int id;
		String name;
		private double salary;
		
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			if(salary > 0) {
				this.salary = salary;
			}
		}

		static String companyName = "CAPGEMINI";
	
	// default/no-arg constructor	
	public Employee() {
			
	}
		
	// constructor to initialize id, name, salary
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Methods
	double incrementSalary() {
		salary += 5000;
		return salary;
	}

	// String representation of an object
	@Override
	public String toString() {
//		int id = 34;
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	

}
