package com.heraizen.cj.date11;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to generate its multiplication table:");
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("Multiplication table for %d is:%n", num);
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d%n", num, i, num*i);
		}
		
	}
	
}
