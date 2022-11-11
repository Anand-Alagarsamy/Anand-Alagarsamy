package com.ty.Employee;

import java.util.Comparator;

public class SortingId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empId-o2.empId;
	}
	
}
