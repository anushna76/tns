package com.tns.generics;

import java.util.function.Supplier;

//Demo for supplier inetface
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Double> sup =()->Math.random();
		System.out.println(sup.get());
	}

}
