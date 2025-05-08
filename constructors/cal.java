package com.tns.constructors;
//parameterised construc and constructor overloading
public class cal {
	int num;
	String name;
	//constructor1
	cal(String name){
		this.name=name;
	}
	//constructor 2
	cal(int num){
		this.num=num;
		
	}
	void display(){
		System.out.println(name);
		
	}
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		cal ob=new cal("anushna");
		cal o=new cal(24);
		ob.display();
		o.print();
		

	}

}
