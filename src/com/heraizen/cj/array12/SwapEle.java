package com.heraizen.cj.array12;

public class SwapEle {

	public static void main(String[] args) {

		int[] input = new int[] { 1, 2, 3, 4 };
		int[] output = new int[4];
		int[] temp;
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i] * 5;
		}
		temp = input;
		input = output;
		output = temp;
		for (int i = 0; i < input.length; i++)
			System.out.println(output[i]);
	}

}
