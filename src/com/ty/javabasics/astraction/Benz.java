package com.ty.javabasics.astraction;

public class Benz implements Car {
	
		public void accelerator() {
			System.out.println("Benz car accelerated");
		}
		
		public void breaks() {
			System.out.println("Benz stoped");
		}
		
		public void gear() {
			System.out.println("Benz changed");
		}
}

