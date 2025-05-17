package com.tns.generics;
//Demo for applying generic on a method
public class GenericMethodDemo {
	//since type is unknown
	public static<T> void displayArray(T[] array){
		
		//for(returntype varname:arrayname)
		for(T i:array) {
			System.out.println("Array elemets" +i);
			
		}
		
		
	}

}
