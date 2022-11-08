package com.ty.javaacessmodifier;

import java.util.Arrays;

public class Practise {
	public static void m1() {
		System.out.println("public method");
	}
	private static void m2() {
		System.out.println("private method");
	}
	protected static void m3() {
		System.out.println("protected method");
	}
	static void m4() {
		System.out.println("default method");
	}
	public static void main(String[] args) {
		Practise.m1();
		Practise.m2();
		Practise.m3();
		Practise.m4();
		
		
		//Arrays a = new Arrays();
	}
}
