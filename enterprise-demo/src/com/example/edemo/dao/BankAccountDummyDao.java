package com.example.edemo.dao;

import java.io.IOException;
import java.util.List;

import com.example.edemo.model.BankAccount;

public class BankAccountDummyDao implements BankAccountDao{
	private List<BankAccount> bankAccounts;
	private FileAccess fileAccess;
	
	public BankAccountDummyDao() throws DataAccessException{
		fileAccess = new FileAccess("resources/accounts.txt");
		bankAccounts = fileAccess.readFile();
	}
	
	@Override
	public void updateAccount(BankAccount bankAccount) {
		for(BankAccount ba: bankAccounts){
			if(ba.getAccountNumber().equals(bankAccount.getAccountNumber())){
				ba.setBalance(bankAccount.getBalance());
			}
		}
		try {
			fileAccess.writeFile(bankAccounts);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
