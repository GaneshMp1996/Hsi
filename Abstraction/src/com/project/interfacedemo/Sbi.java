package com.project.interfacedemo;

public class Sbi implements Bank {

	@Override
	public void checkMinimumBalance() {
		System.out.println("Sbi.checkMinimumBalance()");

	}

	@Override
	public void withdraw() {
		System.out.println("Sbi.withdraw()");

	}

	@Override
	public void generatePin() {
		System.out.println("Sbi.generatePin()");

	}

	@Override
	public void addAdharNumber() {
		System.out.println("Sbi.addAdharNumber()");

	}

	@Override
	public void applyDebitCard() {
		System.out.println("Sbi.applyDebitCard()");

	}

	@Override
	public void applyCreditCard() {
		System.out.println("Sbi.applyCreditCard()");

	}

	
}
