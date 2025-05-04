package com.tns.oops;

public class cal {
		String msg;
		int num;

		cal(String m) {
			msg=m;
		}
		cal(int n){
			num=n;
			}
		void display() {
			System.out.println(msg);
			System.out.println(num);
			
		}
		

	public static void main(String[] args) {
		cal ob=new cal("anush"+ "");
		ob.display();
		cal o=new cal(24);
		o.display();
		
		
		
	}

}
