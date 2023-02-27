package com.project.abstractdemo;

public abstract class Bike extends Vehicle{

	@Override
	public void noOfWheels() {
		System.out.println("2 Wheels for Bike");
		
	}

	@Override
	public void price() {
		System.out.println("Avg Price for Bike is 1lakh");
		
	}

	

	

}
