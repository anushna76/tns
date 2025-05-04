package com.tns.oops;
class Animal{
	public void move() {
	System.out.println("animal is moving");
	}
	public void eat() {
		System.out.println("animal is eating");
		
	}
		
}
class Dog extends Animal{
	public void move() {
		System.out.println("dog is moving");
	
		}
	public void bark() {
		System.out.println("dog is barking");
	}
}

public class Runtimepoly {

	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.move();
		ob.bark();
		ob.eat();

		

	}

}
