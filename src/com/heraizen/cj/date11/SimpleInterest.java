package com.heraizen.cj.date11;


import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the principal amount:");
		int pa = sc.nextInt();
		System.out.print("Enter the rate of Interest");
		float roi = sc.nextFloat();
		System.out.print("Enter the time in years");
		int years = sc.nextInt();
		sc.close();
		
		System.out.printf("Simple Interest is:%f", (pa*roi*years)/100);
				
	}	
}