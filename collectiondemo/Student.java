package cpm.tnsif.collectiondemo;

public class Student {
	public int sid;
	public String sname;
	public String branch;
	public int cgpa;

	
	public Student(int sid, String sname, String branch, int cgpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.cgpa = cgpa;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + "]";
	}
	

}
