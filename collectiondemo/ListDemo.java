package cpm.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		//accepting any kind of data
		List ll=new ArrayList();
		ll.add(10);
		ll.add(10);
		ll.add(24);
		ll.add(30);
		ll.add("anushna");
		ll.add("True");
		System.out.println(ll);
		//accepting only integer type of data in list interface
		List <Integer> l=new  ArrayList<Integer>();
		l.add(5);
		l.add(5);
		l.add(26);
		l.add(18);
		for(int i:l) {
			System.out.println( +i);
			
		
			
			
		}
		
		}

}
