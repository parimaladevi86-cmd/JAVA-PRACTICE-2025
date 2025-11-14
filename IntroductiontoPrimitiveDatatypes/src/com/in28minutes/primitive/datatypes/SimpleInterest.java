package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterest {

	double principal,rate,interest;
	int years;
	 
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public SimpleInterest(double principal, double rate) {
		// TODO Auto-generated constructor stub
		this.principal=principal;
		this.rate=rate;
	}

	public double calculateInterest(int years) {
	       
		double interest= (principal*rate*years)/100;
	    return this.interest=interest;
		 
	}

	public double totalAmount() {
		double totalamount =this.principal+this.interest;
		return totalamount;
		// TODO Auto-generated method stub
		
	}

}
