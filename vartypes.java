package com.tns.var;


public class vartypes {

	public int a;
	static int c=30;
	void display() {
		int b=20;
		System.out.println("local variable inside method is "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vartypes ob=new vartypes();
		int result=ob.a=10;
		System.out.println("instance variable is "+result);
		ob.display();
		System.out.println("static variable is "+c);
	

	}

}
