package com.heraizen.cj.date11;

import java.util.Scanner;

public class AverageWeightThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		float weight1 = sc.nextFloat();
		System.out.println("Enter the weight of the second person:");
		float weight2 = sc.nextFloat();
		System.out.println("Enter the weight of the third person:");
		float weight3 = sc.nextFloat();
		sc.close();
		float avg = (weight1 + weight2 + weight3)/3;
		
		System.out.printf("The average of three persons weight is: %f", avg);

	}

}
