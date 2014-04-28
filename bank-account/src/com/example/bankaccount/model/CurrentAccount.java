package com.example.bankaccount.model;

import java.math.BigDecimal;

public class CurrentAccount extends BankAccount {
	private String checkbookSeries;
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountNumber, String branch,
			AccountHolder accountHolder, BigDecimal balance, String currency, String checkbookSeries) {
		super(accountNumber, branch, accountHolder, balance, currency);
		this.checkbookSeries = checkbookSeries;
	}

	public String getCheckbookSeries() {
		return checkbookSeries;
	}

	public void setCheckbookSeries(String checkbookSeries) {
		this.checkbookSeries = checkbookSeries;
	}
	
}
