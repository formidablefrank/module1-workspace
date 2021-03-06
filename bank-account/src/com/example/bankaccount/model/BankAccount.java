package com.example.bankaccount.model;
import java.math.*;

public class BankAccount {
	private String accountNumber;
	private String branch;
	private AccountHolder accountHolder;
	private BigDecimal balance;
	private String currency;
	
	public BankAccount(String accountNumber, String branch,
			AccountHolder accountHolder, BigDecimal balance, String currency) {
		super();
		this.accountNumber = accountNumber;
		this.branch = branch;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.currency = currency;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getBranch() {
		return branch;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
