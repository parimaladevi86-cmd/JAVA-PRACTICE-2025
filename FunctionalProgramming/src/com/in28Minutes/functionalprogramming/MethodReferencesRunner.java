package com.in28Minutes.functionalprogramming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


 
public class MethodReferencesRunner {

	
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static boolean EvenNumber(Integer number) {
		 
		return number%2==0;
	}
	
	
	 public static int compare(int x, int y) {
	        return (x < y) ? -1 : ((x == y) ? 0 : 1);
	    }
	 
	public static void main(String[] args) {
		List.of("Apple","Ball","cat","dog","elephant").
		stream().map(e->e.length()).
		forEach(e->System.out.println(e));
		System.out.println("==================================");
		
		
		List.of("Apple","Ball","cat","dog","elephant").
		stream().map(String ::length).
		forEach(MethodReferencesRunner::print);
		
		
		Integer max= List.of(17,19,21,33,45,77,85,46).
		stream().filter(MethodReferencesRunner:: EvenNumber).
		max( MethodReferencesRunner::compare).
		orElse(0);

		System.out.println(max);
	}

}
