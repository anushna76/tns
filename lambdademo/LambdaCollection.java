package com.tns.lambdademo;
//predefined functional inetrface
//comaparble->compareTo
import java.util.Arrays;
import java.util.List;

public class LambdaCollection {

	public static void main(String[] args) {
		
		//new keywords shold not be used as array is class and asllist is abstarct method
		List<String> l=Arrays.asList("allen","bobby","alex","chinnu");
		//sorting using lambda
		//first element is a and 2nd elemnt is b like allen is a 
		//comapreTo is abstractmethod
		l.sort((a,b)->a.compareTo(b));
		//we have method called forEach(String s :l)
		l.forEach(names->System.out.println(names));
	}

}
