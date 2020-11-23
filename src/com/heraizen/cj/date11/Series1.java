package com.heraizen.cj.date11;

import java.util.Scanner;

public class Series1 {

	static double sum(int n) {
		double i, s = 0.0;
		for (i = 1; i <= n; i++)
			s = s + 1 / i;
		return s;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number");
		int num = sc.nextInt();
		sc.close();
		System.out.printf("Sum is %f", sum(num));
	}

}
