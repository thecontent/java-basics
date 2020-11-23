package com.heraizen.cj.date11;


import java.util.Scanner;

public class NNatural {

	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			System.out.printf("%d ",i );
		}
		
	}
	
}
