package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
         Book artofProgramming =new Book(1000);
         Book EffecctiveJava =new Book(200);
         Book CleanCode =new Book(300);
         Book Coding =new Book();
         
         System.out.println(Coding.getNoOfCopies());
         
         System.out.println(artofProgramming.getNoOfCopies());
          
         
         artofProgramming.setNoOfCopies(100);
         artofProgramming.increaseNoOfCopies(100);
         artofProgramming.decreaseNoOfCopies(300);
         System.out.println(artofProgramming.getNoOfCopies());
         
         
         
       //  EffecctiveJava.setNoOfCopies(200);
         //EffecctiveJava.increaseNoOfCopies(200);
         //EffecctiveJava.decreaseNoOfCopies(500);
        // System.out.println(EffecctiveJava.getNoOfCopies());
       
         
    
       
         
         
       //  CleanCode.setNoOfCopies(500);
         //System.out.println(CleanCode.getNoOfCopies());
         
       
         


         
			/*
			 * artofProgramming.read(); EffecctiveJava.mark(); CleanCode.print(); int
			 * b1=artofProgramming.noOfCopies=100; int b2=EffecctiveJava.noOfCopies=50; int
			 * b3=CleanCode.noOfCopies=25; System.out.println(b1); System.out.println(b2);
			 * System.out.println(b3);
			 */
	}

}
