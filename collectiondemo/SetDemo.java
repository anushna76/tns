package cpm.tnsif.collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//accepting the data in  in set interface
				Set <Integer> ss=new HashSet <Integer>();
				ss.add(10);
				ss.add(10);
				ss.add(24);
				ss.add(30);
				for(int j:ss) {
					System.out.println(j);
				}
				System.out.println("\n");
					Set <Integer> s=new LinkedHashSet <Integer>();	
					s.add(10);
					s.add(10);
					s.add(24);
					s.add(30);
					for(int k:s)
					{
						System.out.println(k);
					}
					
			}

}
