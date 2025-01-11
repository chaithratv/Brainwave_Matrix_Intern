package com;

public class AccountImpl implements Account {
	 private int accountNumber;
	    private String pin;
	    private double balance;

	    public AccountImpl(int accountNumber, String pin, double balance) {
	        this.accountNumber = accountNumber;
	        this.pin = pin;
	        this.balance = balance;
	    }

	    @Override
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    @Override
	    public String getPin() {
	        return pin;
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    @Override
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	}





