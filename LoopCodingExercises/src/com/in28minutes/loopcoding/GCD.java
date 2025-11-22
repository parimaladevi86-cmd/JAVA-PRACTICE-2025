package com.in28minutes.loopcoding;

public class GCD {

	public int calculateGCD(int number1,int number2) {
	 
		if(number1<0||number2<0)
		{
			return 1;
		}
		
		if(number1==0 ||number2==0) {
			return 0;
		}
	 int remainder=1;
	 while(remainder!=0)
	 {
		  
			 remainder=number1 % number2;
			 number1=number2;
			 number2=remainder;	 	 
	 }
	 int gcd=number1;
		return gcd;
	}

}
