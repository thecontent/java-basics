package com.heraizen.cj.date11;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the marks scored in first subject:");
		int mark1 = sc.nextInt();
		System.out.print("Enter the marks scored in second subject:");
		int mark2 = sc.nextInt();
		System.out.print("Enter the marks scored in third subject:");
		int mark3 = sc.nextInt();
		sc.close();
		
		int total = mark1 + mark2 + mark3; 
		int avg = total/3;
		
		
		if (avg < 35) {
			System.out.printf("Grade: C ");
		} else if (avg >= 35 || avg < 60) {
			System.out.print("Grade: B");
		} else {
			System.out.print("Grade: A");
		}
		
	}
	
}
