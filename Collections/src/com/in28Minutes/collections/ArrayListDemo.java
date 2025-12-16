package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> words = List.of("Apple", "Bat", "cat");
		List<String> wordsArrayList = new ArrayList<String>(words);
		List<String> wordsLinkedList = new LinkedList<String>(words);
		List<String> Vector = new Vector<String>(words);
		List<String>List1 = List.of("1", "2" );
		List<String>List2 = List.of("3", "4" );
		List<String>List3 = List.of("5", "6" ,"16","26","36");
		List<String>mergeList = new ArrayList<>(); 
		mergeList.addAll(List1);
		System.out.println(mergeList);
		mergeList.addAll(List2);
		System.out.println(mergeList);
		mergeList.addAll(List3);
		System.out.println(mergeList);
	 
		
		System.out.println(words);
		System.out.println(words.size());
		System.out.println(words.get(2));
		System.out.println(words.contains("Bat"));
		System.out.println(words.indexOf("cat"));
		System.out.println(words.indexOf("Apple"));
		System.out.println(wordsArrayList);
		System.out.println(wordsLinkedList);
		System.out.println(wordsArrayList.add("dog"));
		System.out.println(wordsLinkedList.add("banana"));
		System.out.println(Vector.add("flower"));
		System.out.println(wordsArrayList);
		System.out.println(wordsLinkedList);
		System.out.println(Vector);
		wordsArrayList.add("dog");
		wordsArrayList.remove(3);
		wordsArrayList.set(2, "3");
		System.out.println(wordsArrayList);
		// System.out.println(wo.s.add("flower"));
		
		for(int i=0;i<mergeList.size();i++) {
			System.out.print(mergeList.get(i));
		} 
		
		  for(String number:mergeList) { 
			   if(number.endsWith("6"))
			  System.out.println(number); 
			  }
		  
				/*
				 * for(String number:mergeList) { if(number.endsWith("6"))
				 * mergeList.remove(number); System.out.println(number); }
				 */
		  
		 Iterator numberIterator= mergeList.iterator();
		 while(numberIterator.hasNext()) {
          System.out.print(numberIterator.next());			 
		 }

		 Iterator<String> numberIterator1= mergeList.iterator();
		 while(numberIterator1.hasNext()) {
			 String n=numberIterator1.next();
			 if(n.equals("5"))
				 numberIterator1.remove();
	         		 
			 } System.out.print(mergeList);	
	}

}
