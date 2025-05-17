package com.tns.generics;

public class GenericMethodMain {

	public static void main(String[] args) {
		//passing method signatures
		//as object type is non primitive we shuld give wrapper class
		Integer[] intarray= {1,2,3};
		String[] stringarray= {" allen"," anush"};
		//call the method
		GenericMethodDemo.displayArray(intarray);
		GenericMethodDemo.displayArray(stringarray);


	}

}
