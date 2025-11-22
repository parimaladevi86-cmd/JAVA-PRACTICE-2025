package com.in28minutes.loopcoding;

public class SumOfDigits {

	public int getSumOfDigits(int number) {
		 
		if(number<0)
		{
			return -1;
		}
		
		if(number==0)
		{
			return 0;
		}
		
		int sum =0;
		while(number>0)
		{
			//System.out.println("inside while");
			int digit = number%10;
			//System.out.println(digit);
			sum = sum+digit;
			//System.out.println(sum);
			number =number/10;
			//System.out.println(number);
		}
		return sum;
	}

}
