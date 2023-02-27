package com.project.interfacedemo;

//-->STd Specific Requirement Document
//-->it is a contract between cleint and service provider
public interface Bank {
	void checkMinimumBalance();

	void withdraw();

	void generatePin();

	void addAdharNumber();

	void applyDebitCard();

	void applyCreditCard();
	
	

}
