package com.cts.processPension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for bank details
 * 
 * 
 *
 */
@Getter
@AllArgsConstructor
public class Bank {
	private String bankName;
	private long accountNumber;
	private String bankType;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
}