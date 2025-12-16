package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1s {

	public static void main(String[] args) {
	 ArrayList<Integer> al = new ArrayList<>();
	 al.add(100);
	 al.add(10);
	 al.add(20);
	 al.add(1, 200);
	System.out.println(al.size());
	 Collections.sort(al);
	 System.out.println(al);
	 Collections.reverse(al);
	 System.out.println(al);
	 System.out.println("List1 al :"+al);
	 System.out.println(al.get(3));
	 Integer a=al.get(0);
	 System.out.println(a);
	 
	 ArrayList  ob = new ArrayList ();
	 ob.add("hello");
	 ob.add('D');
	 ob.add(2, 'E');
	 
	 ob.addAll(al);
	 System.out.println("List`2 ob:"+ob);
     System.out.println(ob.get(6)); 
	 Object s = ob.get(0);
	 System.out.println(s);
	 ob.set(6, 700);
	 System.out.println(ob);
	 ob.remove(5);
	 ob.remove(Integer.valueOf(700));
	 System.out.println(ob);
	 ob.removeAll(al);
	 System.out.println(ob);
	 ob.add(200);
	 ob.retainAll(al);
	 System.out.println(ob);
	 
	 Iterator<Integer> it= al.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 
	 for(int i=0;i<al.size();i++) {
		 System.out.println(al.get(i));
	 }
		
	 for(Integer n:al) {
		 System.out.println(n);
	 }
	 
	  
	}

}
