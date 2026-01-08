package com.in28Minutes.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic {

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        return numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        
    }
    
	
	public static void main(String[] args) {
		     
		 
		List<Integer> oddlist =
	            filterOddNumbers(List.of(1, 2, 3, 4, 5));

	    List<Integer> oddlist1 =
	            filterOddNumbers(List.of(6, 7, 8, 9, 10));
	    
	    List<Integer> oddlist2 =
	            filterOddNumbers(List.of(-3, -2, -1, 0, 1, 2, 3));

		 

	    System.out.println(oddlist);
	    System.out.println("===========");
	    System.out.println(oddlist1);
	    System.out.println("===========");
	    System.out.println(oddlist2);
			 
			  
	    }
}
 

 
