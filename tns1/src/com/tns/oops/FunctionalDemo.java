package com.tns.oops;
@FunctionalInterface
public interface FunctionalDemo {
	//jvm accepts only 1 abstract method and more default method
	void add();
	//void mul();
	 //void mul{
//}
	//writing a default method will not give error 
	default void disp(){
	

}
	}
