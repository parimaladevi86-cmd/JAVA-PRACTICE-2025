package com.in28Minutes.functionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExamples {

	public static void main(String[] args) {
		
		 IntStream.range(1,11).map(e->e*e).forEach(e->System.out.println("Squares of intermediate op:"+e));//intermediate operation
		 List.of("Apple","Bat","cat").stream().map(p->p.toLowerCase()).forEach(p->System.out.println("to lowercase:"+p));//intermediate operation
		 List.of("Apple","Bat","cat").stream().map(p->p.length()).forEach(p->System.out.println("Length:"+p));//intermediate operation
		 
		 
		 int sum=IntStream.range(1, 11).reduce(0,(n1,n2)->n1+n2);//terminal operation
		 
		 int max=List.of(20,10,56,78,32,11).stream().max((n1,n2)->Integer.compare(n1,n2)).get();//terminal operation
		 int min=List.of(20,10,56,78,32,11).stream().min((n1,n2)->Integer.compare(n1,n2)).get();//terminal operation
		 
		
		 List<Integer> oddlist =List.of(20,10,56,78,32,11,43,67,91).stream().filter(e->e%2==1).collect(Collectors.toList());
		 List<Integer> evenlist =List.of(20,10,56,78,32,11,43,67,91).stream().filter(e->e%2==0).collect(Collectors.toList());
		 
		 List<Integer> squares=List.of(20,10,56,78,32,11,43,67,91).stream().map(e->e*e).collect(Collectors.toList());
		 List<Integer>squares1= IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList());
		 
		  Optional<Integer> max1usingoptinal= List.of(17,19,21,33,45,77,85,32,46).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2));//the result will be given using optional word
		  int max1usingget= List.of(17,19,21,33,45,77,85,32,46).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2)).get();// using get optional word is avoided
		  int maxusingorElse=List.of(17,19,21,33,45,77,85).stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);// using orElse to print 0 if no even num present	 
		  
		 System.out.println("sum:"+sum);
		 
		 System.out.println("max:"+max);
		 System.out.println("min:"+min);
		 
		 System.out.println("oddlist:"+oddlist); 
		 System.out.println("evenlist:"+evenlist);
		 
		 System.out.println("squares in the lise:"+squares);
		 System.out.println("squares1 for given range:"+squares1);
		 System.out.println(max1usingoptinal);
		 System.out.println(max1usingget);
		 System.out.println(maxusingorElse);


		
		
		 
		 
		 
		 
		

	}

}
