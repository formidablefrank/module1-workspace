package com.example.edemo.service;

import java.math.BigDecimal;

import com.example.edemo.dao.BankAccountDao;
import com.example.edemo.dao.BankAccountDummyDao;
import com.example.edemo.dao.DataAccessException;
import com.example.edemo.model.BankAccount;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountDao bankAccountDao;
	
	public BankAccountServiceImpl() throws DataAccessException{
		super();
		this.bankAccountDao = new BankAccountDummyDao();
	}
	
	@Override
	public void transferFunds(String sourceAccountNumber,
			String targetAccountNumber, BigDecimal amountToTransfer) throws DataAccessException{
		
		
		//check if first account exists (fetch it)
		BankAccount sourceAccount = bankAccountDao.findAccount(sourceAccountNumber);
		//check if second account exists (fetch it)
		BankAccount targetAccount = bankAccountDao.findAccount(targetAccountNumber);
		//check if there is enough balance
		
		//transfer funds
		BigDecimal sourceBalance = sourceAccount.getBalance();
		BigDecimal targetBalance = targetAccount.getBalance();
		sourceAccount.setBalance(sourceBalance.subtract(amountToTransfer));
		targetAccount.setBalance(targetBalance.add(amountToTransfer));
		//update first account
		bankAccountDao.updateAccount(sourceAccount);
		//update second account
		bankAccountDao.updateAccount(targetAccount);
	}
	
	/*Failure modes
	 * 
	 * First account does not exist (abort and inform)
	 * Second account does not exist (abort and inform)
	 * Insufficient balance (abort and inform user)
	 * Failure due to database failure (trigger roll back)
	 */

	@Override
	public BankAccount findAccount(String accountNumber) throws DataAccessException {
		return this.bankAccountDao.findAccount(accountNumber);
	}

}
