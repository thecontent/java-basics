package com.heraizen.cj.date11;

public class Pattern14 {

	public static void main(String[] args) {

		int n = 5, m = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				System.out.print(n - (j - 1) + " ");
			}
			for (int j = 1; j <= n - m; j++) {
				System.out.print(j + " ");
			}

			m++;
			System.out.println();
		}
	}

}
