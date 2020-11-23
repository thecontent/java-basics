package com.heraizen.cj.date11;

import java.util.Scanner;

public class NNaturalDescend {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int num = sc.nextInt();
		sc.close();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.printf("%d ", i);
			}

		}
	}

}
