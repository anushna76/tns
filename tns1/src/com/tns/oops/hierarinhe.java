package com.tns.oops;
class animal1{
	void eat() {
		System.out.println("animal1 eats");
	}
}

class lion extends animal1{
	void roars() {
		System.out.println("lion roars");
	}
}
class Cat1 extends animal1{
	void meow() {
		System.out.println("cat sounds meow");
	}
	
}
public class hierarinhe {

	public static void main(String[] args) {
		Cat1 ob=new Cat1();
		ob.meow();
		ob.eat();
		
		
	}

}
