package com.project.interfacedemo;

public class Canera implements Bank {

	@Override
	public void checkMinimumBalance() {
		System.out.println("Canera.checkMinimumBalance()");
	}

	@Override
	public void withdraw() {
		System.out.println("Canera.withdraw()");

	}

	@Override
	public void generatePin() {
		System.out.println("Canera.generatePin()");

	}

	@Override
	public void addAdharNumber() {
		System.out.println("Canera.addAdharNumber()");

	}

	@Override
	public void applyDebitCard() {
		System.out.println("Canera.applyDebitCard()");

	}

	@Override
	public void applyCreditCard() {
		System.out.println("Canera.applyCreditCard()");

	}

}
