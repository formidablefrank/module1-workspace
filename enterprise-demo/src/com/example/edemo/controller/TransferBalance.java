package com.example.edemo.controller;

import java.math.BigDecimal;

import com.example.edemo.dao.DataAccessException;
import com.example.edemo.model.BankAccount;
import com.example.edemo.service.BankAccountService;
import com.example.edemo.service.BankAccountServiceImpl;

public class TransferBalance {

	public static void main(String[] args) {
		//business layer is responsible for performing this
		BankAccountService bankAccountService = null;
		//do we need to make interfaces for our services?
		//pluggability, we can change technology implementation smoothly
		//interfaces, technology agnostic
		
		String sourceAccountNumber = "111";
		String targetAccountNumber = "222";
		BigDecimal amountToTransfer = new BigDecimal("1000.00");
		
		BankAccount sourceAccount = null;
		BankAccount targetAccount = null;
		try {
			bankAccountService = new BankAccountServiceImpl();
			bankAccountService.transferFunds(
					sourceAccountNumber, targetAccountNumber, amountToTransfer);
			
			sourceAccount = bankAccountService.findAccount(sourceAccountNumber);
			targetAccount = bankAccountService.findAccount(targetAccountNumber);
			
			// If process successful, display info
			System.out.println(sourceAccount.getAccountHolder());	// Procopio Pahlpak
			System.out.println(sourceAccount.getBalance());		 	// 2000.00
			System.out.println(targetAccount.getAccountHolder());	// Issa Kappha
			System.out.println(targetAccount.getBalance());			// 5000.00
		} catch(DataAccessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
