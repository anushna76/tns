package com.tnsif.functinterface;

import java.util.function.Function;

public class functioneg {
//takes input and gives output<T,R> where T is takes input parameter and R returns output
//function has apply(T,t)method
	public static void main(String[] args) {
		Function<Integer,String> ff=t->t*10+" data multiplied by 10";
		System.out.println(ff.apply(10));
	}

}
