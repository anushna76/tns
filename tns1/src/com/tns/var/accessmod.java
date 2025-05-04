package com.tns.var;

public class accessmod {
		//instance variable
		public int numone;
		private int num;
		protected int number;
			
		//method
		void display() {
			//local variable
		     int numtwo=20;
			System.out.println("This is local variable"+numtwo);
		}
		//static variable
		static int numthree=30;
				
		public static void main(String[] args) {
			//instance of the class
			 accessmod ob=new  accessmod();
			ob.numone=23;
			//protected
			ob.number=34;
			//private
			//ob.num=67;
			
			
			
			//instance var call
			int result=ob.numone=10;
			System.out.println("This is instance variable output"
					+result);
			//local variable
			ob.display();
			
			//static variable
			System.out.println("This is static variable output"
					+ accessmod.numthree);
			
		}
	}


