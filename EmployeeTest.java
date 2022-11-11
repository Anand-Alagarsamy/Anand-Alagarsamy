package com.ty.Employee;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//To create a arraylist to store the object element
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
			
		Employee employee  = new Employee(30,"ABC");//It is going to store in the arraylist
		Employee employee2 = new Employee(20,"XYZ");
		Employee employee3  = new Employee(10,"MNO");
		Employee employee4 = new Employee(50,"DEF");
		Employee employee5 = new Employee(40,"KGF");
		
		System.out.println(arrayList);
		
		arrayList.add(employee);//it will pass the value into the object
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);
		arrayList.add(employee5);
		
		System.out.println(arrayList);
		
		for (Employee employee6 : arrayList) { //for each loop use to print the object value one by one
			System.out.println(employee6);
		}
		
		 System.out.println("**********");
		 
			/*
			 * Collections.sort(arrayList); for (Employee employee7 : arrayList) {
			 * System.out.println(employee7); }
			 */ // 
		 
		
		
		Collections.sort(arrayList,new SortingId());
		for (Employee employee7 : arrayList) {
			System.out.println(employee7);	
		}
		
		System.out.println("***********");
		
		Collections.sort(arrayList,new SortingName());
		for (Employee employee7 : arrayList) {
			System.out.println(employee7);	
		}

	}

}
