package com.heraizen.cj.date11;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int n = sc.nextInt();
		sc.close();
		
		 int t1 = 0, t2 = 1;
	        System.out.print("Fibonacci series up to the entered number is: ");

	        for (int i = 1; i < n; ++i)
	        {
	            System.out.print(t1 + " ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
		
	}
	
}
