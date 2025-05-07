package com.tns.oops;
//program for abstract class

public class bankImple extends Bank{

	public static void main(String[] args) {
		Bank ob=new bankImple();
		ob.display();
		ob.deposit();

	}

	@Override
	void deposit() {
		System.out.println("the amount deposited in the bank is 5000");
	}

}
