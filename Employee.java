package com.ty.Employee;

public class Employee implements Comparable<Employee>{
	
	 int empId;
	String empName;
	
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String toString() {
		return "Employee [empId="+ empId +" , empName = " + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName); // for accending the name
	}
	
	
	/*
	 * public int compareTo(Employee o) { return this.empName.compareTo(o.empName);
	 * } -- For Decending the name
	 */

}
