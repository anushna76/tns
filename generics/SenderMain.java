package com.tns.generics;

public class SenderMain {

	public static void main(String[] args) {
		sender<String> ob=new sender<String>();
		ob.setMessage("hello welcome to generics");
		System.out.println(ob.getMessage());
		
		sender<Integer> o=new sender<Integer>();
		o.setMessage(24);
		System.out.println(o.getMessage());
		
	}

}
