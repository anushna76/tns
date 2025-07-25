package com.tnsif.customer;

import java.util.Collection;
import java.util.List;

import com.tnsif.account.Account;
import com.tnsif.beneficiary.Beneficiary;
import com.tnsif.transaction.Transaction;

public interface CustomerOperations {
	
	void addCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	void addTransaction(Transaction transaction);
	void addBeneficiary(Beneficiary beneficiary);
	void addAccount(Account account);
	
	
	Customer findCustomerByID(int id);
	Transaction findTransactionByID(int id);
	Account findAccountByID(int id);
	Beneficiary findBeneficiaryByID(int id);
	
	
	Collection<Account> getAllAccounts();
	Collection<Customer> getAllCustomers();
	Collection<Transaction> getAllTransactions();
	Collection<Beneficiary> getAllBeneficiaries();
	
	List<Account> getAccountsByCustomerID(int CustomerId);
	List<Transaction> getTransactionsByTransactionID(int TransactionId);
	List<Beneficiary> getBeneficiariesByBeneficiaryID(int BeneficiaryId);
	
}
