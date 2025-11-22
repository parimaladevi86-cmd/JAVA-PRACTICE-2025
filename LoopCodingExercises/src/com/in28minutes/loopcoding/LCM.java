package com.in28minutes.loopcoding;

public class LCM {

	
	int number1,number2;

	public LCM(int number1, int number2) {
		//super();
		this.number1 = number1;
		this.number2 = number2;
	}

 

	public int getNumber1() {
		return number1;
	}



	public void setNumber1(int number1) {
		this.number1 = number1;
	}



	public int getNumber2() {
		return number2;
	}



	public void setNumber2(int number2) {
		this.number2 = number2;
	}



	public int calculateLCM() {
		int product =number1*number2;
		if(number1<0||number2<0)
		{
			return -1;
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
	 int lcm=product/gcd;
		return lcm;
	}

	
	
	

}
