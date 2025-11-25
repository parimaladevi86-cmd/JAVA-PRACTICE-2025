package com.in28minutes.strings;

import java.util.Scanner;

public class StringMagicDuplicates {

	public static void main(String[] args) {
		StringMagicDuplicates magic = new StringMagicDuplicates();
		System.out.println(magic.hasConsecutiveDuplicates("hello"));
		System.out.println(magic.hasConsecutiveDuplicates("world"));
		System.out.println(magic.hasConsecutiveDuplicates(" "));
		System.out.println(magic.hasConsecutiveDuplicates("H"));
		System.out.println(magic.hasConsecutiveDuplicates("HHHello"));
		System.out.println(magic.hasConsecutiveDuplicates("HH"));

	}

	public boolean hasConsecutiveDuplicates(String str) {

		if (str.isEmpty()) {

			System.out.println("inside empty");
			return false;
		}
		if (str.length() < 2) {
			return false;
		}
		
		for (int i = 0; i < (str.length()) - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {

				System.out.println("inside 2 consecutive");
				return true;
			}
		}

		return false;
	}

}
