package com.tns.staticeg;

public class statexample {
	int sid;
	String sname;
	static String collegename="Sri indu";
	 void display() {
		 System.out.println("The details of the student"
				 		+sid+","+sname+","+collegename);
	 }

	public static void main(String[] args) {
     statexample ob=new statexample();
     ob.sid=101;
     ob.sname="kavya";
     ob.display();
    
     statexample  o=new  statexample ();
     o.sid=102;
     o.sname="kavitha";
     o.display();
    
     statexample  b=new  statexample ();
     b.sid=103;
     b.sname="Bobby";
     b.display();
		
		
		
		
	}
}




	