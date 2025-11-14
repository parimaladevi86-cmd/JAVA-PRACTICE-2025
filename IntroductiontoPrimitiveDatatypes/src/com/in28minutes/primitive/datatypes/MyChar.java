package com.in28minutes.primitive.datatypes;

public class MyChar {
 private char ch;
	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch=ch;
	}
	public boolean isVowel() {
		// TODO Auto-generated method stub
		//System.out.println("VOWEL");
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A' ||ch=='E'|| ch=='I'||ch=='O'||ch=='U')
			return true;
		
		return false;
	}
	public boolean isDigit() {
		// TODO Auto-generated method stub
		//System.out.println("DIGIT");
		if(ch>=48 && ch<=57)
			
				return true;
		
		return false;
		 
		 }
	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		//System.out.println("ALPHABET");
		 if(ch>=65 && ch<=90)
		return true;
		 
		 if(ch>=97 && ch<=122)
			 return true;
					 
			return false;
	}
	public boolean isConsonant() {
		// TODO Auto-generated method stub
		//System.out.println("CONSONANT");
		if(isAlphabet() && !isVowel())
			return true;
		return false;
	}
	public static void printLowerCaseAlphabets() {
	 
		System.out.println("LOWERCASE");
		for(char ch='a';ch<='z';ch++)
		{System.out.println("Lowecase Letters:"+ch);
		}
		 
	}
	public static void printUpperCaseAlphabets() {
		System.out.println("UPPERCASE");
		for(char ch='A';ch<='Z';ch++)
		{System.out.println("Lowecase Letters:"+ch);
		}
	}
	

}
