package com.heraizen.assign18;

//import java.util.Random;

public class GameMain {

	public static void main(String[] args) {
		Game arr[] = new Game[10];
		int min = 1;
		int max = 4;
		int random;
		for (int i = 0; i < 10; i++) {
			random = ((int) (Math.random() * (max - min))) + min;
			if (random == 1) {
				arr[i] = new Car();
			}
			if (random == 2) {
				arr[i] = new Bike();
			}
			if (random == 3) {
				arr[i] = new Bicycle();
			}
		}
		for (Game ga : arr) {
			ga.start();
			ga.play();
			ga.stop();
		}
	}
}
