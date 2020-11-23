package com.heraizen.cj.date11;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 value:");
		int a = sc.nextInt();
		System.out.println("Enter the num2 value:");
		int b = sc.nextInt();
		sc.close();
		System.out.printf("%d", a+b);

	}

}
