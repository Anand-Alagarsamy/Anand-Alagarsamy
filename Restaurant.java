package com.ty.restaurant.billcalculator;
import java.util.ArrayList;
import java.util.Scanner;


public class Restaurant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] fooditem = {"Idly","Dosa","Poori","Wada","Rice","Exit"};
		int[] price = new int[]{30,50,45,20,80,0};
		int[] qty = new int[6];
		int sum=0;
		boolean exit = true;
		System.out.println("FOOD ITEM"+"\t\tPrice");
		for (int i=0;i<6;i++)
			System.out.println((i+1)+"."+fooditem[i]+"\t\t\t"+price[i]);
		
		do {

			int ch = input.nextInt();
			if(ch>0 && ch<6) {
				System.out.println("Enter the number of quantities of "+fooditem[ch-1]);
				int q = input.nextInt();
				qty[ch-1]+=q;	
			} else {
				exit = false;
			}
			
		} while(exit);
		
		System.out.println("Please check your order:\n");
		for(int i=0;i<6;i++) {
			if (qty[i]!=0) {
				sum+=qty[i]*price[i];
				System.out.println(fooditem[i]+"* "+qty[i]+"=="+sum+"Rs");
			}
		}
		System.out.println("Your Total bill is :"+sum);
		System.out.println("Thank you for visiting");

	}

}
