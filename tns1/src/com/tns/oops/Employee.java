package com.tns.oops;

public class Employee {
		private int Eid;
		private String Ename;
		
		public int getEid() {
			//get the value
			return Eid;
		}



		public void setEid(int eid) {
			//assigns the value
			Eid = eid;
		}



		public String getEname() {
			return Ename;
		}



		public void setEname(String ename) {
			Ename = ename;
		}


		public static void main(String[] args) {
			Employee ob=new Employee();
			ob.setEid(20);
			System.out.println(ob.getEid());
			System.out.println(ob.Ename="anushna");
		}

	}

