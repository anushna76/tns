package com.tns.oops;
class animal2{
	void eat1() {
		System.out.println("animal2 eats");
	}
}
class lion2 extends animal2{
	void roars() {
		System.out.println("lion roars");
	}
}
class Cat2 extends animal2{
	void meow() {
		System.out.println("cat sounds meow");
	}
	
}
class fish extends lion2{
	void drinks() {
		System.out.println("fish drinks water");

	}
}



public class hybridinhe {

	public static void main(String[] args) {
		fish ob1=new fish();
		ob1.drinks();
		ob1.eat1();
		ob1.roars();
		
		

	}

}
