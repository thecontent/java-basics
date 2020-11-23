package com.heraizen.cj.date11;


import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		
		if (num % 2 == 0) {
			System.out.printf("Entered number is %d is even.", num);
		} else {
			System.out.printf("Entered number is %d is odd.", num);
		}
		
	}
	
}
