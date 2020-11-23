package com.heraizen.cj.date11;

import java.util.Scanner;

public class OddSeries {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		int temp=0;
		if(num > 0) {
			for (int i=1; i<=num; i++) {
				if (i%2 != 0) {					
					System.out.printf("%d ", i);
					temp += i;
				}
			}
		}
		System.out.printf("\nSum of the series is:%d", temp);
	}

}
