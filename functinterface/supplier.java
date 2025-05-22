package com.tnsif.functinterface;

import java.util.function.Supplier;

public class supplier {
//takes no parameter but returns the output
	public static void main(String[] args) {
		Supplier<String> message=()->"Hello";
		System.out.println(message.get());

	}

}
