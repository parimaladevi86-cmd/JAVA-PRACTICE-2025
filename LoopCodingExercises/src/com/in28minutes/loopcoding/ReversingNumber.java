package com.in28minutes.loopcoding;

public class ReversingNumber {

	public int reverseNumber(int number) {
		 
		if(number<0)
		{
			return -1;
		}
		
		if(number==0)
		{
			return 0;
		}
		
		int reverse =0;
		while(number>0)
		{
			 
			int digit = number%10;
			reverse=reverse*10+digit;
			number=number/10;
			 
		}
		return reverse;
		 
	}

}
