package com.heraizen.cj.date11;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int num = sc.nextInt();
		sc.close();

		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

}
