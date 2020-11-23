package com.heraizen.cj.date11;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower range:");
		int low = sc.nextInt();
		System.out.print("Enter the high range:");
		int high = sc.nextInt();
		sc.close();

		while (low < high) {
			boolean flag = false;

			for (int i = 2; i <= low / 2; ++i) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && low != 0 && low != 1)
				System.out.print(low + " ");

			++low;
		}
	}

}
