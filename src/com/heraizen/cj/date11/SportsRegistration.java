package com.heraizen.cj.date11;


import java.util.Scanner;
public class SportsRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name:");
		String name = sc.next();
		System.out.print("Enter the mobile number:");
		@SuppressWarnings("unused")
		int mob = sc.nextInt();
		System.out.print("Enter the age:");
		int age = sc.nextInt();	
		
		sc.close();
		
		if (age >= 18) {
			System.out.printf("“Congratulations %s, for your successful registration.”", name);
		} else {
			System.out.print("“Sorry! You need to be at least 18 years old to get membership.”");
			return;
		}
		

	}

}
