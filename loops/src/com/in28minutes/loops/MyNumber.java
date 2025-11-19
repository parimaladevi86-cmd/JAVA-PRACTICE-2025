package com.in28minutes.loops;

public class MyNumber {
	private int n1;
	/*
	 * public MyNumber(int n1) { this.n1=n1; }
	 * 
	 * public MyNumber() { // TODO Auto-generated constructor stub }
	 */



	public boolean isPrime(int n1) {
		
		if(n1<2)
		{
			return false;
		}
		for(int i=2;i<n1;i++) {
			if(n1%i==0)
				return false;
			 
		}
		
		return true;
	}



	public int sumuptoN(int n1) {
        int sum=0;
        for(int i=1;i<=n1;i++) {
        	sum+=i;	
        }
		return sum;
		 
        
	 
	}

	public int sumOfDivisors(int n1) {
		 int sum1=0;
	 
		 for(int i=2;i<n1;i++) {
			 if(n1%i==0)
	        	sum1+=i;	
			 System.out.println(sum1);
	        }
		return sum1  ;
	}


	public int printANumberTriangle(int n1) {
		 for(int i=1;i<=n1;i++) {
			 for(int j=1;j<=i;j++) {
	        	 System.out.print(j+ " ");
	        }
		  System.out.println();
		 
	}
		 return n1; 

	}
	
}
