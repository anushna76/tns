package com.tns.lambdademo;
//userdefined func interface
@FunctionalInterface
interface MathCal{
	int cal(int a,int b);//abstarct method in functional interface
}
public class MathOperations {
	public static void main(String[] args) {
		//(parameters)->{statements};
		MathCal add=(a,b)->a+b;
		MathCal mul=(a,b)->a*b;
		System.out.println(add.cal(10, 5));
		System.out.println(mul.cal(3,8));
 }
}