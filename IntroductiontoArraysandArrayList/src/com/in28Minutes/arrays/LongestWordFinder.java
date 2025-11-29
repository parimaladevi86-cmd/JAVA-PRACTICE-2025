package com.in28Minutes.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LongestWordFinder {
	
	
	
	private ArrayList<String>words=new ArrayList<String>();
	private String sourcename;
 

	public String LongestWordFinder(String sentence) { 
		String[] words = sentence.split(" ");
		int maxlength = 0;
		String Longestword = "";
		
		if (sentence == null || sentence.isEmpty()) {
			return "";
		}
	

		for (String word : words) {

			if (word.length() > maxlength) {
				maxlength = word.length();
				Longestword = word;
			}
		}
		return Longestword;

	}

}
