package com.project.abstractdemo;

public class Tester {
	public static void main(String[] args) {
		Car car=new Car();
		car.fuel();
		car.price();
		car.noOfWheels();
		System.out.println("***********************");
		Bike1 bike=new Bike1();
		bike.noOfWheels();
		bike.fuel();
		bike.price();
		
	}

}
