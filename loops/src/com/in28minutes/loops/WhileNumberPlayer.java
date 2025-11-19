package com.in28minutes.loops;

public class WhileNumberPlayer {
	
	 
 
	/*
	 * int i=0; public WhileNumberPlayer(int i) { this.i=i; }
	 */
	public void printSquaresUptoLimit(int num) {
		 
		int i = 1;
		while( i*i<num) {
			 
			 System.out.print(i*i + " ");
			i++;
		}
		 
	 System.out.println();

}
	
	public void printCubeUptoLimit(int num) {
		 
		int i = 1;
		while( i*i*i<num) {
			 
			 System.out.print(i*i*i + " ");
			i++;
		}
		 
	}
}