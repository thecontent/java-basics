package com.heraizen.cj.date11;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number num1:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number num2:");
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("Before swap, the values of num1 = %d and num2 = %d.%n", num1, num2);
		
		num1 += num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.printf("After swap, the values of num1 = %d and num2 = %d.", num1, num2);
		
		
		
		

	}

}
