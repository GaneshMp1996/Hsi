package com.project.abstractdemo;
//Abstrct Class--->Incomplete Class
public abstract class Vehicle {
	
	public abstract void noOfWheels() ;
	public abstract void price();
	public abstract void fuel();
	
	public void travel() {//Concrete Method
		System.out.println("By using Vehicle,,we can travel over the India");
	}
		
	

}
