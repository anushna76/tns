package com.tnsif.exception;

public class withoutexcep {

	public static void main(String[] args) {
		//int a=10;
		//int b=0;
		//int res=a/b;
		//System.out.println("the result is :"+res);
		try {
			//int a=10;
			//int b=0;
			//int res=a/b;
			//System.out.println("the result is :"+res);
			int c[]= {1,2,3,4};
			c[5]=5;
			System.out.println("the c is :"+c);
			
		}
		catch(ArithmeticException e){
			System.out.println("Num cannot be divide by zero");
	
			}
		catch(Exception e) {
			System.out.println("given array size is not existing");
		}
		//this will be executed after try catch regardless of the result
		finally {
			System.out.println("tr-catch are executed");
			
		}
	}

}
