package com.project.interfacedemo;

public class Tester {
	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.addAdharNumber();
		sbi.applyCreditCard();
		sbi.checkMinimumBalance();
		sbi.withdraw();
		sbi.generatePin();

		Canera canera = new Canera();
		canera.applyCreditCard();
		canera.checkMinimumBalance();
		canera.withdraw();
		canera.generatePin();
	}

}
