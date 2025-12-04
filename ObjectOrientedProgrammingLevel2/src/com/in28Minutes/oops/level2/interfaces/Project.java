package com.in28Minutes.oops.level2.interfaces;

public class Project {
       interface Test{
    	void nothing();
    	default void nothing1() {
    		
    	}
       }
     class class1 implements Test{

		@Override
		public void nothing() {
			// TODO Auto-generated method stub
			
		}
    	 
     }
     class class2 implements Test{

 		@Override
 		public void nothing() {
 			// TODO Auto-generated method stub
 			
 		}
     	 
      }
	public static void main(String[] args) {
	 //ComplexAlgorithm algorithm = new DummyAlgorithm();
	 ComplexAlgorithm algorithm = new RealAlgorithm();
	System.out.println(algorithm.ComplexAlgorithm(50, 10));
	}
}
