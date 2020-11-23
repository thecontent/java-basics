package com.heraizen.cj.date11;


import java.util.*;

public class BiggSmall {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		sc.close();
		
		if (num1 > num2) {
			System.out.printf("The bigger of two numbers entered (%d and %d) is: %d", num1, num2, num1);
		} else {
			System.out.printf("The bigger of two numbers entered (%d and %d) is: %d", num1, num2, num2);
		}
		
		
	}
	
	
}
