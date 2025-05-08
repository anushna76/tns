package com.tns.constructors;
//copy constructor
public class Book {
	String title;
	Book(String title){
		this.title=title;
	}
	Book(Book b){
		this.title=b.title;
	}
	void display() {
		System.out.println("the title of the book is "+title);
	}

	public static void main(String[] args) {
		Book ob=new Book("JFS");
		Book o=new Book(ob);
		ob.display();
		o.display();
		System.out.println(ob instanceof Book);	//instanceof says wheteher obj belogs to particular class or not	
		System.out.println(o instanceof Book);
	}

}
