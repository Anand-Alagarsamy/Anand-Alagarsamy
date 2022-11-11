package com.ty.Employee;

import java.util.Comparator;

public class SortingName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empName.compareTo(o2.empName);
	}
	
}
