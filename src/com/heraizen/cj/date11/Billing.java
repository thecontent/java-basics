package com.heraizen.cj.date11;


import java.util.Scanner;
public class Billing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the billing amount:");
		int amt = sc.nextInt();
		sc.close();
		
		if (amt > 6000) {
			System.out.printf("Your net billing amount: %d", amt - (amt*0.1));
		} else {
			System.out.printf("Your net billing amount: %d", amt);
		}
		

	}

}
