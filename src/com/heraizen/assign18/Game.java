package com.heraizen.assign18;

public interface Game {
	void start();

	void play();

	void stop();
}

class Car implements Game {
	public void start() {
		System.out.println("Car Starts");
	}

	public void play() {
		System.out.println("Car plays");
	}

	public void stop() {
		System.out.println("Car stops");
	}
}

class Bicycle implements Game {
	public void start() {
		System.out.println("Bicycle Starts");
	}

	public void play() {
		System.out.println("Bicycle plays");
	}

	public void stop() {
		System.out.println("Bicycle stops");
	}
}

class Bike implements Game {
	public void start() {
		System.out.println("Bike Starts");
	}

	public void play() {
		System.out.println("Bike plays");
	}

	public void stop() {
		System.out.println("Bike stops");
	}
}
