package com.heraizen.cj.date11;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empno:");
		int empno = sc.nextInt();
		System.out.print("Enter the employee name:");
		String empname = sc.next();
		System.out.print("Enter the monthly salary:");
		int empsal = sc.nextInt();
		sc.close();

		System.out.printf("Hi %s! Your employee id is %d, monthly salary is Rs %d and yearly salary is Rs %d.", empname, empno, empsal, empsal*12);
		

	}

}
