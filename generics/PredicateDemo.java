package com.tns.generics;

import java.util.function.Predicate;

//predefined functional interfaces
public class PredicateDemo {

	public static void main(String[] args) {
		//test is the absttract method of predicate
	
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("anushna"));
		System.out.println(p.test("tns"));

	}

}
