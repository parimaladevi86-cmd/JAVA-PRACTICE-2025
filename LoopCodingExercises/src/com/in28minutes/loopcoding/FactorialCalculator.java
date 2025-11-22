package com.in28minutes.loopcoding;

	import java.util.Scanner;

public class FactorialCalculator {

 

	public int calculateFactorial(int n ) {
		 
		 
		 if(n<0) {
			 return -1;
		 }
		 int factorial =1;
		  
		 for(int i=2;i<=n;i++) {
			 factorial = factorial *i;
			  
		 }
		 System.out.println(""+factorial);
		 return factorial;
		 
		 
}
}