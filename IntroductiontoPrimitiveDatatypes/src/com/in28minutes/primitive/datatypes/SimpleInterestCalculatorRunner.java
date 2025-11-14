package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleInterestCalculator sc=new SimpleInterestCalculator("90000.00","8");
		SimpleInterestCalculator si=new SimpleInterestCalculator("5000.00","7");
		 BigDecimal finalSum=si.calculateTotalValue(10);
		 System.out.println("final sum:"+finalSum);
		

	}

}
