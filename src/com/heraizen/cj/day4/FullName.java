package com.heraizen.cj.day4;

import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String fName = sc.nextLine();
		System.out.print("Enter middle name: ");
		String mName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lName = sc.nextLine();
		System.out.println("\n\"" + fName + "-" + mName + "-" + lName + "\"");
		sc.close();

	}

}
