package com.tns.string;

import java.util.Scanner;

public class Student {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("enter ur id");
		int sid=sc.nextInt();
		System.out.println("enter ur phonenum");
		long phonenum=sc.nextLong();
		
		System.out.println("the details of student are" +name+ ","+sid+"," +phonenum);
			
		}

}
