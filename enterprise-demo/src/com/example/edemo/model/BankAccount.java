package com.example.edemo.model;

import java.math.BigDecimal;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private BigDecimal balance;

	public BankAccount(String accountNumber, String accountHolder, BigDecimal balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public BigDecimal getBalance() {
		return this.balance;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString(){
		return this.accountNumber + "|" + this.accountHolder + "|" + this.getBalance().toPlainString();
	}
}
