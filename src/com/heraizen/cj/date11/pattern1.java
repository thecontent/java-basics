package com.heraizen.cj.date11;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int k = 1;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<i; j++)				
				System.out.print(k++ + " ");
			System.out.println("");		
		}
	}

}
