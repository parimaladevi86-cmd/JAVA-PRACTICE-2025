package com.in28Minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(100, 200, 300, 400, 551, 3, 55, 11, 10, 55, 3, 22, 22, 19, 19, 100);
		/*
		 * numbers.stream(). forEach(element->System.out.println(element));
		 */

		int normalsum = normalsum(numbers);
		int fpsum = fpsum(numbers);
		int fpoddsum = fpOddSum(numbers);

		interOperations(numbers);
		System.out.println("normalsum:" + normalsum);
		System.out.println("fpsum:" + fpsum);
		System.out.println("Oddsum:" + fpoddsum);

	}

	private static void interOperations(List<Integer> numbers) {
		numbers.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));
		

	}

	private static int fpOddSum(List<Integer> numbers) {
		int sum1 = numbers.stream().filter(number -> number % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		return sum1;
	}

	private static int fpsum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int fpsum1(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

	private static int normalsum(List<Integer> numbers) {
		int normalsum = 0;
		for (int number : numbers) {
			normalsum += number;// mutations
		}
		return normalsum;
	}

}
