package com.tns.oops;
//normal interface
public class bankImple1 implements Bank1 {
	private double balance=1500;

	public static void main(String[] args) {
		Bank1 ob=new bankImple1();
		ob.withdraw(500);
		ob.deposit(2000);

	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("the amount after withdraw " +balance);
		}
		else {
			System.out.println("insufficient amount");
			
		}
}

	@Override
	public void deposit(double amount) {
		if(amount<DEPOSIT_LIMIT) {
			balance=balance+amount;
			System.out.println("the maount after deposit " +balance);
		}
		
	}

}
