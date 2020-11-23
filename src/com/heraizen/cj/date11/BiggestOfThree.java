package com.heraizen.cj.date11;


import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number:");
		int num3 = sc.nextInt();
		sc.close();
		
		if (num1>num2 && num1>num3) {
			System.out.printf("The biggest of the three numbers entered is: %d", num1);
		} else if (num2>num3) {
			System.out.printf("The biggest of the three numbers entered is: %d", num2);
		} else {
			System.out.printf("The biggest of the three numbers entered is: %d", num3);
		}
	}
	
}
