package com.tnsif.functinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateeg {

	public static void main(String[] args) {
		List<String> age=Arrays.asList("anushna","ashu","sahithi","anshi");
		Predicate<String> p=(String s)->s.startsWith("a");
		for(String i:age) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
	}

}
