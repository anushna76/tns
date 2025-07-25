package com.tnsif.customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tnsif.account.Account;
import com.tnsif.beneficiary.Beneficiary;
import com.tnsif.transaction.Transaction;

public  class CustomerService implements CustomerOperations {

	private Map<Integer, Customer> customers = new HashMap<>();
	private Map<Integer, Account> accounts = new HashMap<>();
	private Map<Integer, Transaction> transactions = new HashMap<>();
	private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();
	@Override
	public void addCustomer(Customer customer) {
	// add Customer to customers map, Key - customerID
	}
	@Override
	public void addAccount(Account account) {
	// add Account to accounts map, Key - accountID
	}
	public void addTransaction(Transaction transaction) {
	// add transaction to transactions map, key - transactionID
	// and based on transaction type(deposit or withdraw)update the account balance
	}
	
	public void addBeneficiary(Beneficiary beneficiary) {
	// add beneficiary to beneficiaries map, key - beneficiaryID
	}
	public Customer findCustomerById(int id) {
	return customers.get(id);
	}
	public Account findAccountById(int id) {
	return accounts.get(id);
	}
	public Transaction findTransactionById(int id) {
	return transactions.get(id);
	}
	public Beneficiary findBeneficiaryById(int id) {
	return beneficiaries.get(id);
	}
	public List<Account> getAccountsByCustomerId(int customerId) {
	List<Account> result = new ArrayList<>();
	// retrieve accounts from accounts map of given customerID and add into result
	return result;
	}
	public List<Transaction> getTransactionsByAccountId(int accountId) {
	List<Transaction> result = new ArrayList<>();
	// retrieve transactions from transactions map of given accountID and add into result
	return result;
	}
	public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
	List<Beneficiary> result = new ArrayList<>();
	// retrieve beneficiaries from beneficiaries map of given customerID and add into 
	//result
	return result;
	}
	@Override
	public Collection<Account> getAllAccounts() {
	return accounts.values();
	}
	@Override
	public Collection<Customer> getAllCustomers() {
	return customers.values();
	}
	@Override
	public Collection<Transaction> getAllTransactions() {
	return transactions.values();
	}
	@Override
	public Collection<Beneficiary> getAllBeneficiaries() {
	return beneficiaries.values();
	}
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Customer findCustomerByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Transaction findTransactionByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account findAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Beneficiary findBeneficiaryByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> getAccountsByCustomerID(int CustomerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Transaction> getTransactionsByTransactionID(int TransactionId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Beneficiary> getBeneficiariesByBeneficiaryID(int BeneficiaryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}

