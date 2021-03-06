package com.example.edemo.service;

import java.math.BigDecimal;

import com.example.edemo.dao.DataAccessException;
import com.example.edemo.model.BankAccount;

public interface BankAccountService {

	void transferFunds(String sourceAccountNumber, String targetAccountNumber,
			BigDecimal amountToTransfer) throws DataAccessException;

	BankAccount findAccount(String accountNumber) throws DataAccessException;

}
