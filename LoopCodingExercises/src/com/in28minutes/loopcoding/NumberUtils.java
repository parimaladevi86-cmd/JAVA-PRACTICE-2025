//package com.in28minutes.loops;
package com.in28minutes.loopcoding;
public class NumberUtils {

	public int getLastDigit(int num) {
		
		
		
		if(num<0) {
			System.out.println("inside negative number");
			 return -1;
			 }
		if(num>0)
		{
			int lastdigit= num%10;
			 
			return lastdigit;
		}
		if(num==0) {
			return 0;
		}
		return 0;
	 
		
	}

}
