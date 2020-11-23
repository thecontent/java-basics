package com.heraizen.cj.date11;

import java.util.Scanner;
import java.lang.Math;

public class Series2 {
	
	static double sum(int n) {
		double s = 0.0;
		for (int i = 2; i <= n; i++)
			s = s + 1 / Math.pow(i,3);
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("Sum is %f", sum(num));
		
		for(int i=2; i<=num; i++) {
			
		}
		
	}

}
