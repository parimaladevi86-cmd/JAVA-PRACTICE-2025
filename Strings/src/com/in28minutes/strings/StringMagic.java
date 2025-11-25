package com.in28minutes.strings;

public class StringMagic {

	public int countUppercaseLetters(String str) {
		 
		 
	  if (str.isEmpty())
	  {
		  System.out.println("inside empty");
		  return 0;
	  }
	  int count1 = 0;
	  for(int i=0; i<str.length();i++)
	  {
		
		 
		  int total = 0;
		  if(str.charAt(i)>=65 && str.charAt(i)<=90)
			      total = count1++;
		  if(total==0) {
			  System.out.println("inside uppercaseletter checking");
			  return 0;
		  }
	  }
		 
	  
	  int count = 0;
	  for(int i=0; i<str.length();i++)
	  {
		 
		  if(str.charAt(i)>=65 && str.charAt(i)<=90)
			  count++;
	  }
	  return count;
 
}
}