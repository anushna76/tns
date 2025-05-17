package com.tns.generics;
//demonstration for generic class
public class sender<T> {
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	

	
}
