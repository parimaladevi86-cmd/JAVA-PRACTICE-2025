package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Acuto-generated method stubm
		MyChar mc=new MyChar('E');
		//MyChar mc1=new MyChar('1');
		//MyChar mc2=new MyChar('g');
		System.out.println("VOWEL:"+mc.isVowel());
		System.out.println("CONSONANT:"+mc.isConsonant());

		System.out.println("ALPHABET:"+mc.isAlphabet());
		System.out.println("DIGIT:"+mc.isDigit());
		
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
