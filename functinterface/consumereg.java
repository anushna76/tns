package com.tnsif.functinterface;

import java.util.function.Consumer;

public class consumereg {

	public static void main(String[] args) {
		Consumer<Integer> eligibility=(Integer age)->{
			if(age>18) {
				System.out.println("you are eligible to vote");
		}
			else {
				System.out.println("you are not eligible to vote");
			}
			
		};
		eligibility.accept(20);

	}

}
