package com.in28minutes.loopcoding;

public class CountingDigits {

	 

	public int getNumberOfDigits(int num) {
		
		
		if(num<0) {
			System.out.println("inside negative number");
			 return -1;
			 }
		if(num==0)
		{
			return 1;
		}
	 
			int count =0;
			while(num>0) {
			 
			num= num/10;
			count++;
			
			}
			return count;
	}

	
	
	
}
