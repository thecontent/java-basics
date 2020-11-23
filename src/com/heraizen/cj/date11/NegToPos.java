package com.heraizen.cj.date11;


import java.util.Scanner;
public class NegToPos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		
		if (num < 0) {
			System.out.printf("The result is: %d", -1*num);
		} else {
			System.out.print("Entered number is a positive value.");
		}
		

	}

}
