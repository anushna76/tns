package com.tnsif.assignment1;

public class BankAccMain {

	public static void main(String[] args) {
		try {
			BankAcc ob= new BankAcc(1,10000);
			ob.showBalance();
			ob.deposit(2000);
			ob.withdraw(500);
			ob.showBalance();
		}
		catch(InvalidAmountException e) {
			System.out.println("invalid amount entered");
		}
		catch(InsufficientFundException e) {
			System.out.println("not enough money");
			}
		finally{
			System.out.println("Banking complete");
			
			
		}
		

	}

}
