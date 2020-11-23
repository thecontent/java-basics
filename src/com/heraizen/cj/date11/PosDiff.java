package com.heraizen.cj.date11;


import java.util.Scanner;

public class PosDiff {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number num1:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number num2:");
		int num2 = sc.nextInt();
		sc.close();
		
		int val = num1 - num2;
		
		if (val >= 0) {
			System.out.printf("The result (difference) is: %d", val);
		} else {
			System.out.printf("The result (difference) is: %d", -1*val);
		}
		
	}
	
}
