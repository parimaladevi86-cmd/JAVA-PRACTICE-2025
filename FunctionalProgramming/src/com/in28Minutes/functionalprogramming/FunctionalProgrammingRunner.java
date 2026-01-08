package com.in28Minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Cat","Dog");
		List<Integer> list1 = List.of(10,11,12,13,14,15,16);
		//printBasic(list);
		printWithFPWithFilteringEven(list1);
	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	
	private static void printBasicFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				//System.out.println("hello");
			System.out.println(string);
			}
		}
	}
	
	private static void printWithFP(List<String> list) {
		 list.stream().forEach(
				 element->System.out.println("element -"+element)
				 );
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		 list.stream()
		 .filter(
				 element->element.endsWith("at")
			   )       
		 .forEach(
				 element->System.out.println("element -"+element)
				 );
	}
	
	private static void printWithFPWithFilteringOdd(List<Integer> list1) {
		 list1.stream()
		 .filter(
				 element -> element%2 == 1
			   )       
		 .forEach(
				 element->System.out.println("element -"+element)
				 );
	}
	
	private static void printWithFPWithFilteringEven(List<Integer> list1) {
		 list1.stream()
		 .filter(
				 element -> element%2 == 0
			   )       
		 .forEach(
				 element->System.out.println("element -"+element)
				 );
	}

}
