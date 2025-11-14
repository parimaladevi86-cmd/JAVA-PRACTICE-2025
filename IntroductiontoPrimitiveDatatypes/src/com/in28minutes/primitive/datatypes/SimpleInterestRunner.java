package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		SimpleInterest si=new SimpleInterest(4500.00,7.5);
		si.calculateInterest(5);
		System.out.println("simpleinterest:"+si.calculateInterest(5));
		//BigDecimal interest= si.calculateInterest(5);
		si.totalAmount();
		System.out.println("totalamount:"+si.totalAmount());

	}

}
