package com.project.abstractdemo;

public class Car extends Vehicle {

	@Override
	public void noOfWheels() {
		System.out.println("4 Whleels for Cars");
		
	}

	@Override
	public void price() {
		System.out.println("Avg price for cars is 3lakh");
		
	}

	@Override
	public void fuel() {
		System.out.println("Hybrid Cars");
		
	}

}
