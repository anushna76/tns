package com.tns.oops;
class animal{
	public void eat() {
	System.out.println("animal eats");
	}
}
class dog extends animal{
	public void bark() {
		System.out.println("dog barks");
		
		
	}
}
class cat extends dog{
	public void meow() {
		System.out.println("cat sounds meow");
	}
}
public class multilevelinhe {

	public static void main(String[] args) {
		cat ob=new cat();
		ob.meow();
		ob.bark();
		ob.eat();
		

	}

}
