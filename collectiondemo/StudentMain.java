package cpm.tnsif.collectiondemo;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	
	public static void main(String[] args ) {
		List <Student> s=new  ArrayList<Student>();
		s.add(new Student(101, "anushna", "cse", 89));
		s.add(new Student(102, "sohana", "cse", 89));
		s.add(new Student(103, "rish", "ece", 79));
		for(Student i:s) {
			System.out.println(i);
		}
		System.out.println(s.size());
		System.out.println(s. isEmpty());
		System.out.println(s.contains("anushna"));
		
	}

}
