package com.ty.javabasics.astraction;
import java.util.Scanner;

public class CarFactory {
	static Scanner scanner  = new Scanner(System.in);
	public static Car getCar() {
		System.out.println("Enter the car name");
		String carName = scanner.next();
		if (carName.equalsIgnoreCase("audi")) {
			return new Audi();
		} else if (carName.equalsIgnoreCase("benz")) {
			return new Benz();	
		} else {
			return null;
		}

	}

}


