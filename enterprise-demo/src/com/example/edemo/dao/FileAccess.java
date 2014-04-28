package com.example.edemo.dao;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.edemo.model.BankAccount;

public class FileAccess {
	private String filename;

	public FileAccess(String string) {
		filename = string;
	}
	
	public List<BankAccount> readFile() throws DataAccessException{
		List<BankAccount> bankAccounts = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			while(br.ready()){
				String[] temp = br.readLine().split("%");
				bankAccounts.add(new BankAccount(temp[0], temp[1], new BigDecimal(temp[2])));
			}
		} catch(IOException e){
			throw new DataAccessException("Error reading file");
		}
		return bankAccounts;
	}

	public void writeFile(List<BankAccount> bankAccounts) throws DataAccessException{
		try(BufferedWriter br = new BufferedWriter(new FileWriter(filename))){
			for(BankAccount ba: bankAccounts){
				String temp = ba.getAccountNumber() + "%" + ba.getAccountHolder() + "%" + ba.getBalance().toPlainString();
				br.write(temp);
				br.newLine();
			}
		} catch(IOException e){
			throw new DataAccessException("Error reading file");
		}
	}
}
