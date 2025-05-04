package com.tns.oops;
//method overloading
public class calc {
	//same method with diff return type and parameter
	public int add(int a,int b) {
		return a+b;
		}
	public float add(float a,float b) {
		return a+b;
		}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public void add(int a) {
		
		System.out.println(a);
	}


	public static void main(String[] args) {
		calc ob=new calc();
		System.out.println(ob.add(10,20));
		System.out.println(ob.add(10.5f,10.5f));
		System.out.println(ob.add(11,9,10));
		ob.add(20);
		

	}

}
