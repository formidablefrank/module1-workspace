package com.example.edemo.dao;

import java.io.IOException;
import java.math.BigDecimal;

import com.example.edemo.model.BankAccount;

public class BankAccountDummyDao implements BankAccountDao{
	private BankAccount[] bankAccounts;
	
	public BankAccountDummyDao(){
		bankAccounts = new BankAccount[2];
		bankAccounts[0] = new BankAccount("111","Procopio Pahlpak", new BigDecimal("3000.00"));
		bankAccounts[1] = new BankAccount("222","Issa Kappha", new BigDecimal("4000.00"));
	}
	
	@Override
	public void updateAccount(BankAccount bankAccount) {
		for(BankAccount ba: bankAccounts){
			if(ba.getAccountNumber().equals(bankAccount.getAccountNumber())){
				ba.setBalance(bankAccount.getBalance());
			}
		}
	}

	@Override
	public BankAccount findAccount(String accountNumber) throws DataAccessException{
		String message = null;
		if(accountNumber.equals("xxx")){
			try {
				throw new IOException();
			} catch (IOException e) {
				message = String.format("Failed to fetch account %s", accountNumber);
				throw new DataAccessException(message, e);
			}
		}
		for(BankAccount ba: bankAccounts){
			if(ba.getAccountNumber().equals(accountNumber)){
				return ba;
				//BankAccount temp = new BankAccount(bankAccounts[i].getAccountNumber(), bankAccounts[i].getAccountHolder(), bankAccounts[i].getBalance());
				//return temp
			}
		}
		message = String.format("No account exists %s", accountNumber);
		throw new DataAccessException(message);
	}
}
