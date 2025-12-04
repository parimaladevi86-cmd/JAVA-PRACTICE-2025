package com.in28Minutes.trainingoops.encapsulation;

public class BankAccount {

	private int balance;

	private int Openingbalance;
	private int depositamount;
	private int withdrawamount;
	
	/*
	 * public int getOpeningbalance() { return Openingbalance; }
	 * 
	 * public void setOpeningbalance(int openingbalance) { this.Openingbalance =
	 * openingbalance; }
	 * 
	 * public int getBalance() { return balance; }
	 * 
	 * public void setBalance(int balance) { this.balance = balance; }
	 * 
	 * public int getDepositamount() { return depositamount; }
	 * 
	 * public void setDepositamount(int depositamount) { this.depositamount =
	 * depositamount; }
	 * 
	 * public int getWithdrawamount() { return withdrawamount; }
	 * 
	 * public void setWithdrawamount(int withdrawamount) { this.withdrawamount =
	 * withdrawamount; }
	 */
	public BankAccount(int Openingbalance) {
		if (Openingbalance > 0) {
			this.Openingbalance=Openingbalance;
			
			this.balance += Openingbalance;
		} else {
			throw new IllegalArgumentException("Opening balance must be >= 0");
		}

	}

	public boolean deposit(int depositamount) {

		if (depositamount > 0) {
			this.depositamount=depositamount;
			balance = balance + depositamount;
			return true;

		} else {
			return false;
		}

	}

	public boolean withdraw(int withdrawamount) {
		if (withdrawamount > 0 && withdrawamount <= balance) {
			this.withdrawamount=withdrawamount;
			balance = balance - withdrawamount;
			return true;
		} else {
			return false;
		}

	}
	/*
	 * @Override public String toString() { return "BankAccount [balance=" + balance
	 * + ", Openingbalance=" + Openingbalance + ", depositamount=" + depositamount +
	 * ", withdrawamount=" + withdrawamount + "]"; }
	 */

	@Override
	public String toString() {
		return "[balance=" + balance + "]";
	}

	 
	
	 
}
