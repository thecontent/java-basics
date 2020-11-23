package com.heraizen.cj.date11;

public class Pattern8 {

	public static void main(String[] args) {

		int i, j, num, n = 5;

		for (i = 0; i < n; i++) // outer loop for rows
		{
			num = 1;
			for (j = 0; j <= i; j++) // inner loop for rows
			{
				System.out.print(num + " ");
				num++;
			}
			for (j = i; j >= 0; j--) // inner loop for rows
			{
				num--;
				System.out.print(num + " ");
			}

			// ending line after each row
			System.out.println();
		}

	}

}
