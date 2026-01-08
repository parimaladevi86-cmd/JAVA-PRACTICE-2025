package com.in28Minutes.functionalprogramming;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FunctionalProgrammingMagicCubes {

	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		return IntStream.rangeClosed(1,n).map(e->e*e*e).boxed().collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		
	
				
				List<Integer> list1 =
						getCubesOfFirstNNumbers(6);
				
				List<Integer> list2 =
						getCubesOfFirstNNumbers(5);
				
				List<Integer> list3 =
						getCubesOfFirstNNumbers(0);
				System.out.println(list1);
				System.out.println(list2);
				System.out.println(list3);
				
				
          //Input: n = 5 Return Value: [1, 8, 27, 64, 125]

		//Input: n = 3 Return Value: [1, 8, 27]

	    // Input: n = 0 Return Value: []

	}

}
