package com.heraizen.cj.date11;

import java.util.*;

public class BillDiscount {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bill amount:");
		int amt = sc.nextInt();
		System.out.print("Do you have a membership card:");
		String mem = sc.next();
		sc.close();
		
		int dis;
		if (mem.equals("Y")) {
			dis = (amt * 10)/100;
			System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %d and net amount payable is Rs %d.", amt, dis, amt-dis);
		} else {
			System.out.print(mem);
			dis = (amt * 3)/100;
			System.out.printf("Thank you! Your total bill amount is Rs %d, discount is Rs %d and net amount payable is Rs %d.", amt, dis, amt-dis);
		}
		
	}
	
}
