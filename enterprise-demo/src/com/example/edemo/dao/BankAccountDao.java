package com.example.edemo.dao;

import com.example.edemo.model.BankAccount;

public interface BankAccountDao{

	public BankAccount findAccount(String sourceAccountNumber) throws DataAccessException;

	public void updateAccount(BankAccount bankAccount) throws DataAccessException;

}
