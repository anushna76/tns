package com.tnsif.exception;

public class validateage {
	public static void age(int age) throws MyException,ArithmeticException {
		if(age<18) {
			throw new MyException("Access denied,you must be atleast 18years old");
		}
		else {
			System.out.println("access permitted");
		}
	}

	public static void main(String[] args) throws MyException,ArithmeticException {
		//no need of object as we mentioned static
		try {
		validateage.age(21);
		}
		catch(Exception e){
			
		}
		
	}

}
