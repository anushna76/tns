package com.tns.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamOperations {
	public static void main(String[] args) {
		//passing data via customed class
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(101,"anuh",79878.9f));
		l.add(new Employee(102,"anuhya",75478.9f));
		l.add(new Employee(103,"soh",89878.9f));
		//filter data based on salary-> >72000
		Stream<Employee> st=l.stream().filter(sal->sal.esal>79000.00f);
		st.forEach(n->System.out.println("Eid "+ n.empid + " Ename "+ n.ename));
		System.out.println("this is filter");
		
		
		//map(retrieve the names of employee in upper case)
	//passing data using array struc
		String[] str= {"sam","anushna","divya","dolly"};
	//passing data directly
		List<String> name=Arrays.asList("bobby","anith","sob");
		//string s=new string()
		//s.touppercase()
		name.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("this is map");
		
		//sorting
		List<String> names=Arrays.asList("bobby","anith","sob");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("this is sorting");
		
		//reduce
		System.out.println("reduce operations");
		List<Integer> number=Arrays.asList(10,20,30,40,60);
		//bifunction<T,U,R>->t-one value,u is 2nd value,R is result of t nd u
		int sum=number.stream().reduce(0,Integer::sum);	
		System.out.println("the sum is" +sum);
	}
}
